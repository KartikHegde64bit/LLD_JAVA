package com.spring.systemdesign.SingletonPattern.eagerinitialization;

public class Logger {
    // create and inititalize instance variable
    public static Logger logger = new Logger();
    // create a private constructor
    private Logger() {};

    // create a thread safe getInstance using 'synchronized' keyword
    public static Logger getInstance(){
        return logger;
    }
}
