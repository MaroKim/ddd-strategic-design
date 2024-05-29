package kitchenpos.testfixture;

import kitchenpos.menu.domain.Menu;
import kitchenpos.orders.domain.OrderLineItem;

public class OrderLineItemTestFixture {

    public static OrderLineItem createOrderLine(long seq, int quantity, Menu menu){
        OrderLineItem orderLineItem = new OrderLineItem();
        orderLineItem.setSeq(seq);
        orderLineItem.setQuantity(quantity);
        orderLineItem.setMenu(menu);
        orderLineItem.setPrice(menu.getPrice());
        orderLineItem.setMenuId(menu.getId());

        return orderLineItem;
    }
}
