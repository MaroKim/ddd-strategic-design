package kitchenpos.testfixture;

import kitchenpos.deliveryorder.domain.DeliveryOrder;
import kitchenpos.orders.domain.Order;
import kitchenpos.orders.domain.OrderLineItem;
import kitchenpos.orders.domain.OrderStatus;
import kitchenpos.orders.domain.OrderType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class DeliveryOrderTestFixture {

    public static DeliveryOrder createOrderRequest(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems, String deliveryAddress){
        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setType(type);
        deliveryOrder.setStatus(status);
        deliveryOrder.setOrderDateTime(orderDateTime);
        deliveryOrder.setOrderLineItems(orderLineItems);
        deliveryOrder.setDeliveryAddress(deliveryAddress);

        return deliveryOrder;
    }



    public static DeliveryOrder createOrder(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems, String deliveryAddress){
        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setId(UUID.randomUUID());
        deliveryOrder.setType(type);
        deliveryOrder.setStatus(status);
        deliveryOrder.setOrderDateTime(orderDateTime);
        deliveryOrder.setOrderLineItems(orderLineItems);
        deliveryOrder.setDeliveryAddress(deliveryAddress);

        return deliveryOrder;
    }
}
