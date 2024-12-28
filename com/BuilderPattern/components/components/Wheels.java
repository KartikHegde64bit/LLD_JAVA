package com.spring.systemdesign.builderpattern.components.components;

public class Wheels {
    private String wheelType;
    private Integer wheelDiameter;

    public Wheels(String wheelType, Integer wheelDiameter){
        this.wheelType = wheelType;
        this.wheelDiameter = wheelDiameter;
    }

    public Integer getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(Integer wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    @Override
    public String toString(){
        return "{ Wheel Type: " + wheelType + ", Wheel Size: " + wheelDiameter + " Inches }";
    }

}
