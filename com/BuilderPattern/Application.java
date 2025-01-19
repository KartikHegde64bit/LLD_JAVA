package com.spring.systemdesign.BuilderPattern;

public class Application {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new CarBuilderImpl();
        Car car = director.constructSedan(builder);
        System.out.println(car.toString());
    }
}
