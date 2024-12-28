package com.spring.systemdesign.builderpattern;

public class CarValidator {
    public static void validate(Car car) {
        if (car.getEngine() == null) {
            throw new IllegalStateException("Car must have an engine.");
        }
        if (car.getWheels() == null) {
            throw new IllegalStateException("Car must have wheels.");
        }
        if (car.getPaintColor() == null || car.getPaintColor().isEmpty()) {
            throw new IllegalStateException("Paint color is required.");
        }
    }
}

