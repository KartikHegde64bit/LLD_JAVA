package com.spring.systemdesign.FactoryPattern.AirTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class PlaneTransport implements Transport {
    private final String type;
    private final Integer cost;
    private final Integer time;

    public PlaneTransport(String type, Integer cost, Integer time) {
        this.type = type;
        this.cost = cost;
        this.time = time;
    }

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
