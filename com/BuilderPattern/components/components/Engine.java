package com.spring.systemdesign.BuilderPattern.components.components;

public class Engine {
    private String engine;

    public Engine(String engine){
        this.engine = engine;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }

    public String getEngine(){
        return engine;
    }

    @Override
    public String toString(){
        return engine;
    }


}
