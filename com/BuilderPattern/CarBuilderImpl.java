package com.spring.systemdesign.builderpattern;
import java.util.List;

import com.spring.systemdesign.builderpattern.components.components.Accessories;
import com.spring.systemdesign.builderpattern.components.components.Engine;
import com.spring.systemdesign.builderpattern.components.components.Wheels;

public class CarBuilderImpl implements CarBuilder {
    private Engine engine;
    private Wheels wheels;
    private String paintColor;
    private String transmissionType;
    private List<Accessories> accessories;

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this; // Returning 'this' to enable method chaining
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
        CarValidator.validate(car);
        return car;
    }


}
