package com.spring.systemdesign.FactoryPattern;

public class TransportManager {

    private TransportSelector transportSelector;

    public TransportManager() {
        transportSelector = new TransportSelector(); // Initialize selector
    }

    public Transport getTransport(String priority, Integer packageWeight){
        // Make decision via a more specialized selector
        TransportFactory factory = transportSelector.selectFactory(priority, packageWeight);
        return factory.getTransport(packageWeight); // Return transport from selected factory
    }
}
