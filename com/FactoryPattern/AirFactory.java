package com.spring.systemdesign.FactoryPattern;

import com.spring.systemdesign.FactoryPattern.AirTransport.DroneTransport;
import com.spring.systemdesign.FactoryPattern.AirTransport.PlaneTransport;

public class AirFactory implements TransportFactory{
    // if the weight is less than 500kgs, then Boat, else ship
    public Transport getTransport(Integer weight){
        if(weight < 100) {
            return new DroneTransport();
        }
        return new PlaneTransport();
    }
}
