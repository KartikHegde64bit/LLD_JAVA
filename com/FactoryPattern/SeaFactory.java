package com.spring.systemdesign.FactoryPattern;

import com.spring.systemdesign.FactoryPattern.WaterTransport.BoatTransport;
import com.spring.systemdesign.FactoryPattern.WaterTransport.ShipTransport;

public class SeaFactory implements TransportFactory{

    // if the weight is less than 500kgs, then Boat, else ship
    public Transport getTransport(Integer weight){
        if(weight < 500) {
            return new BoatTransport();
        }
        return new ShipTransport();

    }
}
