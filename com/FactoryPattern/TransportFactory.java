package com.spring.systemdesign.FactoryPattern;

public interface TransportFactory {
    public Transport getTransport(Integer weight);

}
