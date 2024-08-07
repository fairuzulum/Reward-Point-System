package majumundur.com.reward_point_system.repository;

import majumundur.com.reward_point_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
