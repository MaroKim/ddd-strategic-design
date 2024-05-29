package kitchenpos.deliveryorder.application;

import kitchenpos.application.FakeKitchenridersClient;
import kitchenpos.application.InMemoryMenuRepository;
import kitchenpos.deliveryorder.domain.DeliveryOrder;
import kitchenpos.deliveryorder.domain.DeliveryOrderRepository;
import kitchenpos.deliveryorder.domain.InMemoryDeliveryOrderRepository;
import kitchenpos.infra.KitchenridersClient;
import kitchenpos.menu.domain.Menu;
import kitchenpos.menu.domain.MenuProduct;
import kitchenpos.menu.domain.MenuRepository;
import kitchenpos.orders.domain.Order;
import kitchenpos.orders.domain.OrderLineItem;
import kitchenpos.orders.domain.OrderStatus;
import kitchenpos.orders.domain.OrderType;
import kitchenpos.product.domain.Product;
import kitchenpos.testfixture.MenuProductTestFixture;
import kitchenpos.testfixture.MenuTestFixture;
import kitchenpos.testfixture.OrderLineItemTestFixture;
import kitchenpos.testfixture.ProductTestFixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class DeliveryOrderServiceTest {

    private DeliveryOrderRepository deliveryOrderRepository;
    private MenuRepository menuRepository;
    private KitchenridersClient kitchenridersClient;
    private DeliveryOrderService deliveryOrderService;
    Product product;
    MenuProduct menuProduct;
    Menu menu;
    OrderLineItem orderLineItem;

    @BeforeEach
    void setUp() {
        this.deliveryOrderRepository = new InMemoryDeliveryOrderRepository();
        this.menuRepository = new InMemoryMenuRepository();
        this.kitchenridersClient = new FakeKitchenridersClient();
        this.deliveryOrderService = new DeliveryOrderService(deliveryOrderRepository, menuRepository, kitchenridersClient);
        product = ProductTestFixture.createProduct("후라이드치킨", 17000L);
        menuProduct = MenuProductTestFixture.createMenuProductRequest(1L, 1L, product);
        menu = MenuTestFixture.createMenu("후라이드치킨", 17000L, true, List.of(menuProduct));
        menuRepository.save(menu);
        orderLineItem = OrderLineItemTestFixture.createOrderLine(1L, 1, menu);

    }

    @Test
    void create() {
        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setType(OrderType.DELIVERY);
        deliveryOrder.setStatus(OrderStatus.WAITING);
        deliveryOrder.setOrderDateTime(LocalDateTime.now());
        deliveryOrder.setOrderLineItems(List.of(orderLineItem));
        deliveryOrder.setDeliveryAddress("서울시 xx구 xx동 aa아파트 101동 1101호");
        DeliveryOrder response = deliveryOrderService.create(deliveryOrder);

        assertThat(response.getId()).isNotNull();
    }

    @Test
    void accept() {
    }

    @Test
    void serve() {
    }

    @Test
    void startDelivery() {
    }

    @Test
    void completeDelivery() {
    }

    @Test
    void complete() {
    }

    @Test
    void findAll() {
    }
}