package kitchenpos.takeoutorder.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import kitchenpos.orders.domain.Order;

@Entity
@DiscriminatorValue(value = "TAKEOUT")
public class TakeOutOrder extends Order {


}
