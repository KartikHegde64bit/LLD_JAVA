package com.spring.systemdesign.FactoryPattern.WaterTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class BoatTransport implements Transport {
    private final String type = "BOAT";
    private final String mode = "WATER";
    private final Integer cost;
    private final Integer time;

    public BoatTransport(Integer cost, Integer time) {
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