package com.spring.systemdesign.NullObjectPattern;

public class VocChartImpl implements ChartComponent {
    Long componentId;
    String componentName;

    public Long getComponentId(){
        return 0L;
    }

    public String getComponentName() {
        return "";
    }

    public void setComponentName(String componentName) {
        
    }
}