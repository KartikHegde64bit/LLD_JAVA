package com.spring.systemdesign.FactoryPattern.LandTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class TrainTransport implements Transport {

    private String type = "TRAIN";
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

    @Override
    public String toString(){
        return "Mode: {" + this.mode + "}" + " Type{ " + this.type + " }";
    }
}
