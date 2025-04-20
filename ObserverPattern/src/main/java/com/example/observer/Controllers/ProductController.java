package com.example.observer.Controllers;


import com.example.observer.Services.ProductService;
import com.example.observer.dto.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mycompany/product")
public class ProductController {
    private final ProductService productService; // Assuming you have a UserService

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    public ResponseEntity<String> createProduct(@RequestBody Product product) throws Exception {
        try{
            productService.createProduct(product);
            return ResponseEntity.status(HttpStatus.CREATED).body(product.toString());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unable to create product");
        }
    }

    @GetMapping("/{productId}")
    public ResponseEntity<String> getProduct(@PathVariable Long productId){
        Product product = productService.getProductById(productId);
        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product.toString());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unable to find the product");
    }
}
