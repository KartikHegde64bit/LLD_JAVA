package com.spring.systemdesign.FactoryPattern.LandTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class TruckTransport implements Transport {
    private String type = "TRUCK";
    private String mode = "LAND";
    private Integer cost;
    private Integer time;

    public String getType() {
        return type;
    }

    public Integer getTime() {
        return time;
    }

    public Integer getCost(){
        return cost;
    }
}
