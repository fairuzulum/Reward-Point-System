package majumundur.com.reward_point_system.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "m_rewards")
public class Reward {
    @Id
    @GeneratedValue(generator = "reward-id")
    @GenericGenerator(name = "reward-id", strategy = "majumundur.com.reward_point_system.utils.RewardIdGenerator")
    private String id;

    private String name;

    private int pointsRequired;
}
