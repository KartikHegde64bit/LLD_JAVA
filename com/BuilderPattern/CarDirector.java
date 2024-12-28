package com.spring.systemdesign.builderpattern;

import com.spring.systemdesign.builderpattern.components.components.Engine;
import com.spring.systemdesign.builderpattern.components.components.Wheels;

public class CarDirector {
    public Car constructSedan(CarBuilder builder) {
        return builder
                .setEngine(new Engine("V6"))
                .setWheels(new Wheels("Alloy", 16))
                .setPaintColor("Blue")
                .setTransmissionType("Automatic")
                .build();
    }

    public Car constructSUV(CarBuilder builder) {
        return builder
                .setEngine(new Engine("V8"))
                .setWheels(new Wheels("Off-road", 18))
                .setPaintColor("Black")
                .setTransmissionType("Manual")
                .build();
    }
}

