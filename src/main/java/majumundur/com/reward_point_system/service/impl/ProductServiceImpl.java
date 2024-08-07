package majumundur.com.reward_point_system.service.impl;

import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.dto.request.ProductRequest;
import majumundur.com.reward_point_system.entity.Merchant;
import majumundur.com.reward_point_system.entity.Product;
import majumundur.com.reward_point_system.repository.MerchantRepository;
import majumundur.com.reward_point_system.repository.ProductRepository;
import majumundur.com.reward_point_system.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final MerchantRepository merchantRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(ProductRequest product) {
        ProductRequest request = ProductRequest.builder()
                .productName(product.getProductName())
                .price(product.getPrice())
                .merchantId(product.getMerchantId())
                .build();

        Optional<Merchant> merchant = merchantRepository.findById(request.getMerchantId());

        Product productrequest = Product.builder()
                .name(request.getProductName())
                .price(request.getPrice())
                .merchant(merchant.orElse(null))
                .build();
        return productRepository.save(productrequest);


    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
