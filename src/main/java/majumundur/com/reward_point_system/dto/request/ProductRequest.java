package majumundur.com.reward_point_system.dto.request;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequest {
    private String productName;
    private Long price;
    private String merchantId;
}
