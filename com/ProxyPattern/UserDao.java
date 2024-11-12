package com.ProxyPattern;

public interface UserDao {

    void setUserId(Long userId, String role) throws Exception;

    void setUserName(String userName, String role) throws Exception;
    
    Long getUserId(String role) throws Exception;

    String getUserName(String role) throws Exception;
}
