package com.spring.systemdesign.SingletonPattern.syncgetinstance;

public class Application {
    public static void main(String[] args){
        Logger logger = Logger.getInstance();
        //System.out.println(logger);
        // testing with multithreading
//        for(int i=0; i < 5; i++) {
//            Multithreader obj = new Multithreader();
//            obj.start();
//        }
    }
}
