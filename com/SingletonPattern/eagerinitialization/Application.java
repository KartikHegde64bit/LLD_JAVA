package com.spring.systemdesign.SingletonPattern.eagerinitialization;

public class Application {
    public static void main(String[] args){
        Logger logger = Logger.getInstance();
        System.out.println(logger);
        // testing with multithreading
        for(int i=0; i < 500; i++) {
            Multithreader obj = new Multithreader();
            obj.start();
        }
    }
}
