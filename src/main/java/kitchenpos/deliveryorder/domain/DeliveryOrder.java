package kitchenpos.deliveryorder.domain;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import kitchenpos.orders.domain.Order;

@Entity
@DiscriminatorValue(value = "DELIVERY")
public class DeliveryOrder extends Order {


    @Column(name = "delivery_address")
    private String deliveryAddress;


    public DeliveryOrder() {
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(final String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


}
