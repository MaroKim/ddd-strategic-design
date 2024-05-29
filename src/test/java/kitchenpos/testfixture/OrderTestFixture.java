package kitchenpos.testfixture;

import kitchenpos.eatinorder.domain.OrderTable;
import kitchenpos.orders.domain.Order;
import kitchenpos.orders.domain.OrderLineItem;
import kitchenpos.orders.domain.OrderStatus;
import kitchenpos.orders.domain.OrderType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderTestFixture {

    public static Order createOrderRequest(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems){
        Order order = new Order();
        order.setType(type);
        order.setStatus(status);
        order.setOrderDateTime(orderDateTime);
        order.setOrderLineItems(orderLineItems);

        return order;
    }

    public static Order createOrderRequest(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems, OrderTable orderTable){
        Order order = new Order();
        order.setType(type);
        order.setStatus(status);
        order.setOrderDateTime(orderDateTime);
        order.setOrderLineItems(orderLineItems);
        //order.setOrderTable(orderTable);
        //order.setOrderTableId(orderTable.getId());

        return order;
    }

    public static Order createOrder(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems){
        Order order = new Order();
        order.setId(UUID.randomUUID());
        order.setType(type);
        order.setStatus(status);
        order.setOrderDateTime(orderDateTime);
        order.setOrderLineItems(orderLineItems);

        return order;
    }

    public static Order createOrder(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems, OrderTable orderTable){
        Order order = new Order();
        order.setId(UUID.randomUUID());
        order.setType(type);
        order.setStatus(status);
        order.setOrderDateTime(orderDateTime);
        order.setOrderLineItems(orderLineItems);
        //order.setOrderTable(orderTable);
        //order.setOrderTableId(orderTable.getId());

        return order;
    }
}
