package com.spring.systemdesign.SingletonPattern.getinstancesync;

import com.spring.systemdesign.SingletonPattern.getinstancesync.Logger;

public class Multithreader extends Thread{
    @Override
    public void run(){
        try{
            Logger logger = Logger.getInstance();
            System.out.println(logger);
        } catch (Exception e) {
            System.out.println("Something went wrong due to: " + e);
        }

    }
}
