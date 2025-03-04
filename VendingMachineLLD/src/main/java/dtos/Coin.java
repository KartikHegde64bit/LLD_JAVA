package dtos;

public class Coin {
    public Coin(Integer value){
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    Integer value;
}
