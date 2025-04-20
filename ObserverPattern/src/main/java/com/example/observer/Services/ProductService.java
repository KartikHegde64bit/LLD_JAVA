package com.example.observer.Services;

import com.example.observer.Repository.MemoryRepository;
import com.example.observer.dto.Product;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    public void createProduct(Product product){
        product.setProductId(System.currentTimeMillis());
        MemoryRepository.getProductMap().put(product.getProductId(), product);
    }

    public Product getProductById(Long productId){
        return MemoryRepository.getProductMap().get(productId);
    }
}
