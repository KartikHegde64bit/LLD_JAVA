package services;

import dto.User;
import repository.MemoryRepository;

import java.util.UUID;

public class UserService {
    public UUID createUser(String userName){
        User newUser = new User(userName);
        System.out.println("User Created: " + userName);
        MemoryRepository.addUser(newUser);
        return newUser.getUserId();
    }

    public User getUserByUserId(UUID userId){
        User user = MemoryRepository.getUserList().stream()
                .filter(curUser -> curUser.getUserId().equals(userId)) // Use .equals() for UUID comparison
                .findFirst() // Get the first matching user
                .orElse(null);
        return user;
    }
}
