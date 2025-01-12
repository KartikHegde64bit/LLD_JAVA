package com.spring.systemdesign.FactoryPattern;

import com.spring.systemdesign.FactoryPattern.WaterTransport.BoatTransport;

public class SeaFactory implements TransportFactory{

    // if the weight is less than 500kgs, then Boat, else ship
    public Transport getTransport(int weight){
        if(weight < 500) {
            return new BoatTransport();
        }

    }
}
