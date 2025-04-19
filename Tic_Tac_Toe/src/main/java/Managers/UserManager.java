package Managers;
import dto.User;

public class UserManager {
    public static User createUser(String name, char symbol){
        return new User(name, symbol);
    }
}
