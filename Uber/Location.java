package Uber;

public class Location {

    private Integer xCoordinate;
    private Integer yCoordinate;

    public Location (Integer x, Integer y){
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Integer xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Integer yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

}
