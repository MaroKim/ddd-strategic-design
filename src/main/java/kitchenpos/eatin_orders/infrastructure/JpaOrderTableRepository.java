package kitchenpos.eatin_orders.infrastructure;

import kitchenpos.eatin_orders.domain.OrderTable;
import kitchenpos.eatin_orders.domain.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
