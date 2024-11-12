package com.ProxyPattern;

public interface UserDao {

    void setUserId(Long userId);

    void setUserName(String userName);
    
    Long getUserId();

    String getUserName();
}
