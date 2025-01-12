package com.spring.systemdesign.SingletonPattern.getinstancesync;

public class Logger {
    // create an instance variable
    public static Logger logger;
    // create a private constructor
    private Logger() {};

    // create a thread safe getInstance using 'synchronized' keyword
    public static Logger getInstance(){
        if(logger == null){
            try{
                Thread.sleep(10000); // Artificial delay
            }catch(Exception e) {
                System.out.println("Exception occurred");
            }
            synchronized (Logger.class){
                if(logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
