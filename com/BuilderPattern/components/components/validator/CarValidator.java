package com.spring.systemdesign.BuilderPattern.components.components.validator;

import com.spring.systemdesign.BuilderPattern.Car;

public class CarValidator {

    public static void validate (Car car, EngineType engineType) throws Exception {
        if (car.getEngine() == null) {
            throw new IllegalStateException("Car must have an engine.");
        }
        validateEngine(car, engineType);
        painColorValidator(car);
    }

    public static void validateEngine(Car car, EngineType engineType) {
        String carEngine = car.getEngine().getEngine();
        if (!engineType.getSupportedEngines().contains(carEngine)) {
            throw new IllegalArgumentException("Engine type " + carEngine + " is not supported for " + engineType);
        }
    }

    public static void painColorValidator(Car car) throws Exception {
        if (car.getPaintColor() == null || car.getPaintColor().isEmpty()) {
            throw new IllegalStateException("Paint color is required.");
        }
    }
}

