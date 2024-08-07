package majumundur.com.reward_point_system.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "m_transactions")
public class Transaction {
    @Id
    @GeneratedValue(generator = "transaction-id")
    @GenericGenerator(name = "transaction-id", strategy = "majumundur.com.reward_point_system.utils.TransactionIdGenerator")
    private String id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private LocalDateTime transactionTime;
}
