package com.spring.systemdesign.FactoryPattern;

public class Application {
    public static void main(String[] args){
        TransportManager manager = new TransportManager();
        TransportFactory factory = (TransportFactory) manager.getTransport("COST", 1000);
        Transport transport = factory.getTransport(1000);
    }


}
