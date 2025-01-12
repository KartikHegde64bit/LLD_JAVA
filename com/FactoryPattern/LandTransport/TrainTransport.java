package com.spring.systemdesign.FactoryPattern.LandTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class TrainTransport implements Transport {

    private final String type;
    private final Integer cost;
    private final Integer time;

    public TrainTransport(String type, Integer cost, Integer time) {
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
