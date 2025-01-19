package com.spring.systemdesign.FactoryPattern;

public enum Priority {
    COST(new LandFactory()),
    TIME(new AirFactory()),
    DEFAULT(new LandFactory());

    private final TransportFactory factory;

    Priority(TransportFactory factory) {
        this.factory = factory;
    }

    public TransportFactory getFactory() {
        return factory;
    }
}

