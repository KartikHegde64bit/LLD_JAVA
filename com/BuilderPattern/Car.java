package com.spring.systemdesign.BuilderPattern;

import java.util.List;
import com.spring.systemdesign.BuilderPattern.components.components.Accessories;
import com.spring.systemdesign.BuilderPattern.components.components.Engine;
import com.spring.systemdesign.BuilderPattern.components.components.Wheels;

public class Car {
    private final Engine engine;
    private final Wheels wheels;
    private final String paintColor;
    private final String transmissionType;
    private final List<Accessories> accessories;

    // Constructor (package-private to enforce use of builder)
    Car(Engine engine, Wheels wheels, String paintColor, String transmissionType, List<Accessories> accessories) {
        this.engine = engine;
        this.wheels = wheels;
        this.paintColor = paintColor;
        this.transmissionType = transmissionType;
        this.accessories = accessories;
    }

    // Getters
    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public List<Accessories> getAccessories() {
        return accessories;
    }

    @Override
    public String toString() {
        return "Car {" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", paintColor='" + paintColor + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", accessories=" + accessories +
                '}';
    }
}
