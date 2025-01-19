package com.spring.systemdesign.FactoryPattern.AirTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class DroneTransport implements Transport {
    private String type = "DRONE";
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

    @Override
    public String toString(){
        return "Mode: {" + this.mode + "}" + " Type{ " + this.type + " }";
    }
}
