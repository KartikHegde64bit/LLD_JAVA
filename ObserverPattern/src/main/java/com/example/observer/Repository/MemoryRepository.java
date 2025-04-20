package com.example.observer.Repository;

import com.example.observer.dto.Product;
import com.example.observer.dto.User;

import java.util.concurrent.ConcurrentHashMap;

public class MemoryRepository {
    public static ConcurrentHashMap<Long, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(ConcurrentHashMap<Long, User> userMap) {
        this.userMap = userMap;
    }

    private static ConcurrentHashMap<Long, User> userMap = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<Long, Product> getProductMap() {
        return productMap;
    }

    public static void setProductMap(ConcurrentHashMap<Long, Product> productMap) {
        MemoryRepository.productMap = productMap;
    }

    private static ConcurrentHashMap<Long, Product> productMap = new ConcurrentHashMap<>();

}
