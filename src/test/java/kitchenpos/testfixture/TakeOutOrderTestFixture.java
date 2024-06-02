package kitchenpos.testfixture;

import kitchenpos.orders.domain.Order;
import kitchenpos.orders.domain.OrderLineItem;
import kitchenpos.orders.domain.OrderStatus;
import kitchenpos.orders.domain.OrderType;
import kitchenpos.takeoutorder.domain.TakeOutOrder;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class TakeOutOrderTestFixture {

    public static TakeOutOrder createOrderRequest(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems){
        TakeOutOrder takeOutOrder = new TakeOutOrder();
        takeOutOrder.setType(type);
        takeOutOrder.setStatus(status);
        takeOutOrder.setOrderDateTime(orderDateTime);
        takeOutOrder.setOrderLineItems(orderLineItems);

        return takeOutOrder;
    }



    public static TakeOutOrder createOrder(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems){
        TakeOutOrder order = new TakeOutOrder();
        order.setId(UUID.randomUUID());
        order.setType(type);
        order.setStatus(status);
        order.setOrderDateTime(orderDateTime);
        order.setOrderLineItems(orderLineItems);

        return order;
    }
}
