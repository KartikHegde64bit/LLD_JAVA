package com.spring.systemdesign.builderpattern;

import java.util.List;

import com.spring.systemdesign.builderpattern.components.components.Accessories;
import com.spring.systemdesign.builderpattern.components.components.Engine;
import com.spring.systemdesign.builderpattern.components.components.Wheels;
import com.spring.systemdesign.builderpattern.components.components.validator.EngineType;

public interface CarBuilder {

    CarBuilder setEngine(Engine engine);

    CarBuilder setWheels(Wheels wheels);

    CarBuilder setPaintColor(String paint);

    CarBuilder setTransmissionType(String transmissionType);

    CarBuilder setAccessories(List<Accessories> accessories);

    CarBuilder setEngineType(EngineType engineType);

    Car build();
}
