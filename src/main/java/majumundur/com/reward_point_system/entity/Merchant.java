package majumundur.com.reward_point_system.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_merchants")
public class Merchant {
    @Id
    @GeneratedValue(generator = "merchant-id")
    @GenericGenerator(name = "merchant-id", strategy = "majumundur.com.reward_point_system.utils.MerchantIdGenerator")
    private String id;

    private String name;

    private String username;

    private String password;




}
