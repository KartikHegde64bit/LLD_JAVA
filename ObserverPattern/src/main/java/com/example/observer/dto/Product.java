package com.example.observer.dto;

public class Product {
    private Long productId;
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString(){
        return "ProductName: " + this.getProductName() + " ProductId: " + this.getProductId() + " ";
    }
}
