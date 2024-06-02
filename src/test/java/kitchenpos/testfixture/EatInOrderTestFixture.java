package kitchenpos.testfixture;

import kitchenpos.eatinorder.domain.EatInOrder;
import kitchenpos.eatinorder.domain.OrderTable;
import kitchenpos.orders.domain.Order;
import kitchenpos.orders.domain.OrderLineItem;
import kitchenpos.orders.domain.OrderStatus;
import kitchenpos.orders.domain.OrderType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class EatInOrderTestFixture {

    public static EatInOrder createOrderRequest(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems, OrderTable orderTable){
        EatInOrder eatInOrder = new EatInOrder();
        eatInOrder.setType(type);
        eatInOrder.setStatus(status);
        eatInOrder.setOrderDateTime(orderDateTime);
        eatInOrder.setOrderLineItems(orderLineItems);
        eatInOrder.setOrderTable(orderTable);
        eatInOrder.setOrderTableId(orderTable.getId());

        return eatInOrder;
    }

    public static EatInOrder createOrder(OrderType type, OrderStatus status, LocalDateTime orderDateTime, List<OrderLineItem> orderLineItems, OrderTable orderTable){
        EatInOrder eatInOrder = new EatInOrder();
        eatInOrder.setId(UUID.randomUUID());
        eatInOrder.setType(type);
        eatInOrder.setStatus(status);
        eatInOrder.setOrderDateTime(orderDateTime);
        eatInOrder.setOrderLineItems(orderLineItems);
        eatInOrder.setOrderTable(orderTable);
        eatInOrder.setOrderTableId(orderTable.getId());

        return eatInOrder;
    }
}
