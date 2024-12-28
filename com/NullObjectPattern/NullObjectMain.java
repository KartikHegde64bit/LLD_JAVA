package com.NullObjectPattern;
import com.NullObjectPattern.ChartComponent;


public class NullObjectMain{
    
    public static void main(Object[] args) {

        ChartComponent chartComponent = new ChartComponent();
        try {
            chartComponent.setComponentName("New_Name");
            String componentName = chartComponent.getComponentName();
            
        } catch (Exception e) {
            System.out.println("Issue while working with component object");
        }
    }
}