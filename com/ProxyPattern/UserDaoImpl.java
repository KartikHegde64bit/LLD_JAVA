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
    public Long getUserId(String role) {
        return userId;
    }

    @Override 
    public String getUserName(String role) {
        return userName;
    }

    @Override
    public void setUserId(Long userId, String role) {
        this.userId = userId;
    }

    @Override
    public void setUserName(String userName, String role) {
        this.userName = userName;
    }
}
