package com.spring.systemdesign.FactoryPattern;

public class Application {
    public static void main(String[] args){
        TransportManager manager = new TransportManager();
        Transport transport = manager.getTransport("TIME", 1000);
        System.out.println(transport);
    }
}
