package majumundur.com.reward_point_system.service.impl;

import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.entity.Reward;
import majumundur.com.reward_point_system.repository.RewardRepository;
import majumundur.com.reward_point_system.service.RewardService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RewardServiceImpl implements RewardService {

    private final RewardRepository rewardRepository;

    @Override
    public List<Reward> getAllRewards() {
        return rewardRepository.findAll();
    }

    @Override
    public Reward saveReward(Reward reward) {
        return rewardRepository.save(reward);
    }

    @Override
    public void deleteReward(String id) {
        rewardRepository.deleteById(id);
    }
}
