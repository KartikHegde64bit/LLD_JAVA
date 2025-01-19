package Uber.UserImpl;

import Uber.User;

public class Driver implements User {

    private String name;
    private String id;
    private Double rating;

    public Driver (String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Double getRating() {
        return rating;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

}
