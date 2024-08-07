package majumundur.com.reward_point_system.repository;

import majumundur.com.reward_point_system.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
