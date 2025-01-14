package com.spring.systemdesign.FactoryPattern.WaterTransport;

import com.spring.systemdesign.FactoryPattern.Transport;

public class ShipTransport implements Transport {
    private String type = "SHIP";
    private String mode = "WATER";
    private Integer cost;
    private Integer time;

    public String getType() {
        return type;
    }

    public Integer getTime() {
        return time;
    }

    public Integer getCost() {
        return cost;
    }
}
