package dto;

import java.util.UUID;

public class User {

    String userName;
    UUID userId;

    public User(String userName){
        this.userName = userName;
        this.userId = UUID.randomUUID();
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
