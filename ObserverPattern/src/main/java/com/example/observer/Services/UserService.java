package com.example.observer.Services;

import com.example.observer.Repository.MemoryRepository;
import com.example.observer.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(User user) throws Exception{
        System.out.println("Testing User Creation: " + user.toString());
        if(user.getUserName().equals("") && user.getEmail().equals("")){
            throw new Exception("Arguments Cannot Be Empty");
        }
        user.setUserId(System.currentTimeMillis());
        MemoryRepository.getUserMap().put(user.getUserId(), user);
    }

    public User getUserById(Long userId){
        return MemoryRepository.getUserMap().get(userId);
        //return user;
    }
}
