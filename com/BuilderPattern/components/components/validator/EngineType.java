package com.spring.systemdesign.builderpattern.components.components.validator;

import java.util.List;

public enum EngineType {
    SEDAN(List.of("V4", "V6")),
    SUV(List.of("V6", "V8")),
    TRUCK(List.of("V8", "V12")),
    ELECTRIC(List.of("BatteryElectric"));
    private final List<String> supportedEngines;
    EngineType(List<String> supportedEngines) {
        this.supportedEngines = supportedEngines;
    }

    public List<String> getSupportedEngines() {
        return supportedEngines;
    }

}
