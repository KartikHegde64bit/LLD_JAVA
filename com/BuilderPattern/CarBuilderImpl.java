package com.spring.systemdesign.BuilderPattern;
import java.util.List;

import com.spring.systemdesign.BuilderPattern.components.components.Accessories;
import com.spring.systemdesign.BuilderPattern.components.components.Engine;
import com.spring.systemdesign.BuilderPattern.components.components.Wheels;
import com.spring.systemdesign.BuilderPattern.components.components.validator.CarValidator;
import com.spring.systemdesign.BuilderPattern.components.components.validator.EngineType;

public class CarBuilderImpl implements CarBuilder {
    private Engine engine;
    private Wheels wheels;
    private String paintColor;
    private String transmissionType;
    private List<Accessories> accessories;
    private EngineType engineType;

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this; // Returning 'this' to enable method chaining
    }

    public CarBuilder setEngineType(EngineType engineType){
        this.engineType = engineType;
        return this;
    }

    @Override
    public CarBuilder setWheels(Wheels wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public CarBuilder setPaintColor(String color) {
        this.paintColor = color;
        return this;
    }

    @Override
    public CarBuilder setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    @Override
    public CarBuilder setAccessories(List<Accessories> accessories) {
        this.accessories = accessories;
        return this;
    }

    @Override
    public Car build() {
        // Construct the Car object using the set values
        Car car = new Car(engine, wheels, paintColor, transmissionType, accessories);
        try{
            CarValidator.validate(car, engineType);
        }catch(Exception e){
            System.out.println("Exception occurred:" + e);
            return null;
        }
        return car;
    }


}
