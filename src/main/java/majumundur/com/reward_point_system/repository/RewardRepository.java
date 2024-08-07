package majumundur.com.reward_point_system.repository;

import majumundur.com.reward_point_system.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository extends JpaRepository<Reward, String> {
}
