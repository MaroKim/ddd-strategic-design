package kitchenpos.takeoutorder.application;


import kitchenpos.menu.domain.Menu;
import kitchenpos.menu.domain.MenuRepository;
import kitchenpos.orders.domain.OrderLineItem;
import kitchenpos.orders.domain.OrderStatus;
import kitchenpos.orders.domain.OrderType;
import kitchenpos.takeoutorder.domain.TakeOutOrder;
import kitchenpos.takeoutorder.domain.TakeOutOrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class TakeOutOrderService {

    private final TakeOutOrderRepository takeOutOrderRepository;
    private final MenuRepository menuRepository;

    public TakeOutOrderService(
            final TakeOutOrderRepository takeOutOrderRepository,
            final MenuRepository menuRepository
    ) {
        this.takeOutOrderRepository = takeOutOrderRepository;
        this.menuRepository = menuRepository;
    }

    @Transactional
    public TakeOutOrder create(final TakeOutOrder request) {
        final OrderType type = request.getType();
        if (Objects.isNull(type)) {
            throw new IllegalArgumentException();
        }
        final List<OrderLineItem> orderLineItemRequests = request.getOrderLineItems();
        if (Objects.isNull(orderLineItemRequests) || orderLineItemRequests.isEmpty()) {
            throw new IllegalArgumentException();
        }
        final List<Menu> menus = menuRepository.findAllByIdIn(
                orderLineItemRequests.stream()
                        .map(OrderLineItem::getMenuId)
                        .toList()
        );
        if (menus.size() != orderLineItemRequests.size()) {
            throw new IllegalArgumentException();
        }
        final List<OrderLineItem> orderLineItems = new ArrayList<>();
        for (final OrderLineItem orderLineItemRequest : orderLineItemRequests) {
            final long quantity = orderLineItemRequest.getQuantity();
            if (type != OrderType.EAT_IN) {
                if (quantity < 0) {
                    throw new IllegalArgumentException();
                }
            }
            final Menu menu = menuRepository.findById(orderLineItemRequest.getMenuId())
                    .orElseThrow(NoSuchElementException::new);
            if (!menu.isDisplayed()) {
                throw new IllegalStateException();
            }
            if (menu.getPrice().compareTo(orderLineItemRequest.getPrice()) != 0) {
                throw new IllegalArgumentException();
            }
            final OrderLineItem orderLineItem = new OrderLineItem();
            orderLineItem.setMenu(menu);
            orderLineItem.setQuantity(quantity);
            orderLineItems.add(orderLineItem);
        }
        TakeOutOrder order = new TakeOutOrder();
        order.setId(UUID.randomUUID());
        order.setType(type);
        order.setStatus(OrderStatus.WAITING);
        order.setOrderDateTime(LocalDateTime.now());
        order.setOrderLineItems(orderLineItems);

        return takeOutOrderRepository.save(order);
    }

    @Transactional
    public TakeOutOrder accept(final UUID orderId) {
        final TakeOutOrder order = takeOutOrderRepository.findById(orderId)
                .orElseThrow(NoSuchElementException::new);
        if (order.getStatus() != OrderStatus.WAITING) {
            throw new IllegalStateException();
        }
        order.setStatus(OrderStatus.ACCEPTED);
        return order;
    }

    @Transactional
    public TakeOutOrder serve(final UUID orderId) {
        final TakeOutOrder order = takeOutOrderRepository.findById(orderId)
                .orElseThrow(NoSuchElementException::new);
        if (order.getStatus() != OrderStatus.ACCEPTED) {
            throw new IllegalStateException();
        }
        order.setStatus(OrderStatus.SERVED);
        return order;
    }

    @Transactional
    public TakeOutOrder complete(final UUID orderId) {
        final TakeOutOrder order = takeOutOrderRepository.findById(orderId)
                .orElseThrow(NoSuchElementException::new);
        final OrderType type = order.getType();
        final OrderStatus status = order.getStatus();

        if (status != OrderStatus.SERVED) {
            throw new IllegalStateException();
        }

        order.setStatus(OrderStatus.COMPLETED);
        return order;
    }

    @Transactional(readOnly = true)
    public List<TakeOutOrder> findAll() {
        return takeOutOrderRepository.findAll();
    }

}
