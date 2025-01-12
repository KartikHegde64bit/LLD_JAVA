package com.spring.systemdesign.FactoryPattern;

import com.spring.systemdesign.FactoryPattern.WaterTransport.BoatTransport;

public class LandFactory {
    public Transport getTransport(){
        return new BoatTransport();
    }
}
