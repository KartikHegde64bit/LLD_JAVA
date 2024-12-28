package com.spring.systemdesign.builderpattern;

public class Application {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new CarBuilderImpl();
        Car car = (Car) director.constructSedan(builder);
        System.out.println(car.toString());
    }
}
