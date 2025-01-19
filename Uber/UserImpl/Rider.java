package Uber.UserImpl;

import Uber.User;

public class Rider implements User {
    private String name;
    private String id;
    private Double rating;


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
