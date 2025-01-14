package com.spring.systemdesign.FactoryPattern;

import com.spring.systemdesign.FactoryPattern.LandTransport.TrainTransport;
import com.spring.systemdesign.FactoryPattern.LandTransport.TruckTransport;

public class LandFactory implements TransportFactory{
    // if the weight is less than 500kgs, then Boat, else ship
    public Transport getTransport(Integer weight){
        if(weight < 500) {
            return new TruckTransport();
        }
        return new TrainTransport();
    }
}
