package majumundur.com.reward_point_system.controller;

import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.dto.request.ProductRequest;
import majumundur.com.reward_point_system.entity.Product;
import majumundur.com.reward_point_system.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product saveProduct(@RequestBody ProductRequest product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}