package com.spring.systemdesign.FactoryPattern;

import com.spring.systemdesign.FactoryPattern.AirTransport.DroneTransport;

public class AirFactory {
    public Transport getTransport(){
        return new DroneTransport();
    }
}
