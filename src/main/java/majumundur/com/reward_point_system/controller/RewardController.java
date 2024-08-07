package majumundur.com.reward_point_system.controller;


import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.entity.Reward;
import majumundur.com.reward_point_system.service.RewardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/reward")
public class RewardController {

    private final RewardService rewardService;

    @GetMapping
    public List<Reward> getAllRewards() {
        return rewardService.getAllRewards();
    }

    @PostMapping
    public Reward saveReward(@RequestBody Reward reward) {
        return rewardService.saveReward(reward);
    }

    @DeleteMapping("/{id}")
    public void deleteReward(@PathVariable String id) {
        rewardService.deleteReward(id);
    }
}
