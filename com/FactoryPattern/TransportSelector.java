package com.spring.systemdesign.FactoryPattern;

public class TransportSelector {
    private static final int WEIGHT_THRESHOLD = 1000;

    public TransportFactory selectFactory(String priority, Integer packageWeight) {
        try{
            if (packageWeight > WEIGHT_THRESHOLD) {
                return new SeaFactory();
            }
            return Priority.valueOf(priority.toUpperCase()).getFactory();
        } catch (Exception e){
            throw new IllegalArgumentException("Invalid priority or weight");
        }

    }
}
