package majumundur.com.reward_point_system.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "m_products")
public class Product {
    @Id
    @GeneratedValue(generator = "product-id")
    @GenericGenerator(name = "product-id", strategy = "majumundur.com.reward_point_system.utils.ProductIdGenerator")
    private String id;

    private String name;

    private Long price;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;
}
