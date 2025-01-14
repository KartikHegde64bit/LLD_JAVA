package com.spring.systemdesign.FactoryPattern.AirTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class PlaneTransport implements Transport {
    private String type = "PLANE";
    private String mode = "AIR";
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
