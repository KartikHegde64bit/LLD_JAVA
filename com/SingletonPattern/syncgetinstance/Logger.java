package com.spring.systemdesign.SingletonPattern.syncgetinstance;

public class Logger {
    // create an instance variable
    public static Logger logger;
    // create a private constructor
    private Logger() {};

    // create a thread safe getInstance using 'synchronized' keyword
    public static synchronized Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
}
