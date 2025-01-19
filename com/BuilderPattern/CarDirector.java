package com.spring.systemdesign.BuilderPattern;

import com.spring.systemdesign.BuilderPattern.components.components.Engine;
import com.spring.systemdesign.BuilderPattern.components.components.Wheels;
import com.spring.systemdesign.BuilderPattern.components.components.validator.EngineType;
import com.spring.systemdesign.BuilderPattern.CarBuilder;
import com.spring.systemdesign.BuilderPattern.Car;

public class CarDirector {
    public Car constructSedan(CarBuilder builder) {
        return builder
                .setEngineType(EngineType.SEDAN)
                .setEngine(new Engine("V6"))
                .setWheels(new Wheels("Alloy", 16))
                .setPaintColor("Blue")
                .setTransmissionType("Automatic")
                .build();
    }

    public Car constructSUV(CarBuilder builder) {
        return builder
                .setEngineType(EngineType.SUV)
                .setEngine(new Engine("V8"))
                .setWheels(new Wheels("Off-road", 18))
                .setPaintColor("Black")
                .setTransmissionType("Manual")
                .build();
    }
}

