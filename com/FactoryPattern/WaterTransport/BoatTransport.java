package com.spring.systemdesign.FactoryPattern.WaterTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class BoatTransport implements Transport {
    private String type = "BOAT";
    private String mode = "WATER";
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

    @Override
    public String toString(){
        return "Mode: {" + this.mode + "}" + " Type{ " + this.type + " }";
    }
}