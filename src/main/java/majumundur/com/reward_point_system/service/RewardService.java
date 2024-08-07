package majumundur.com.reward_point_system.service;

import majumundur.com.reward_point_system.entity.Reward;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RewardService {
    List<Reward> getAllRewards();
    Reward saveReward(Reward reward);
    void deleteReward(String id);
}
