package au.com.riosoftware.model.repository;


import au.com.riosoftware.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
