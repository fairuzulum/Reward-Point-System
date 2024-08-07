package majumundur.com.reward_point_system.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_customers")
public class Customer {
    @Id
    @GeneratedValue(generator = "customer-id")
    @GenericGenerator(name = "customer-id", strategy = "majumundur.com.reward_point_system.utils.CustomerIdGenerator")
    private String id;

    private String name;

    private String phoneNumber;

    private String email;

    private String password;

    private Long points;


}
