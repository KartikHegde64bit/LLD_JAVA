package com.ProxyPattern;

public class UserDaoImpl implements UserDao {
    private Long userId;
    private String userName;

    // Constructor
    public UserDaoImpl(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @Override
    public Long getUserId() {
        return userId;
    }

    @Override 
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
