package com.spring.systemdesign.FactoryPattern;

public class TransportManager {
    public TransportFactory getTransport(String priority, Integer packageWeight){
        if(packageWeight > 1000) {
            return new SeaFactory();
        } else if(priority.equals("COST")){
            return new LandFactory();
        } else if(priority.equals("TIME")) {
            return new AirFactory();
        }
        return new LandFactory();
    }
}
