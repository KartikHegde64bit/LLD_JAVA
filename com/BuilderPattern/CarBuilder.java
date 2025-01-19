package com.spring.systemdesign.BuilderPattern;

import java.util.List;

import com.spring.systemdesign.BuilderPattern.components.components.Accessories;
import com.spring.systemdesign.BuilderPattern.components.components.Engine;
import com.spring.systemdesign.BuilderPattern.components.components.Wheels;
import com.spring.systemdesign.BuilderPattern.components.components.validator.EngineType;

public interface CarBuilder {

    CarBuilder setEngine(Engine engine);

    CarBuilder setWheels(Wheels wheels);

    CarBuilder setPaintColor(String paint);

    CarBuilder setTransmissionType(String transmissionType);

    CarBuilder setAccessories(List<Accessories> accessories);

    CarBuilder setEngineType(EngineType engineType);

    Car build();
}
