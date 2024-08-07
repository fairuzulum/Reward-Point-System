package majumundur.com.reward_point_system.service;

import majumundur.com.reward_point_system.dto.request.ProductRequest;
import majumundur.com.reward_point_system.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product saveProduct(ProductRequest product);
    void deleteProduct(String id);
}
