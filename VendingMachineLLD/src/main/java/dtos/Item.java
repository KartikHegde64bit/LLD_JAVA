package dtos;

public class Item {
    Integer productId;
    String name;
    Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Item(Integer productId, String name, Integer price){
        this.name = name;
        this.productId = productId;
        this.value = price;
    }

}
