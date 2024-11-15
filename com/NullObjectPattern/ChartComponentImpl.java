

public class ChartComponentImpl implements ChartComponet {
    Long componentId;
    String componentName;

    public Long getComponentId(){
        return componentId;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }
}