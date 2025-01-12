package com.spring.systemdesign.FactoryPattern;

public class TransportManager {
    public TransportFactory getTransport(String priority, Integer packageWeight){
        if(packageWeight > 1000) {
            return SeaFactory();
        }
    }
}
