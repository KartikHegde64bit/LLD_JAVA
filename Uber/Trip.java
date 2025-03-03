package Uber;

import Uber.UserImpl.Rider;
import Uber.UserImpl.Driver;

public class Trip {
    private Rider rider;
    private Driver tripDriver;
    private Location source;
    private Location destination;
    private Double price;
    private PricingStrategy priceStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;

    public Trip(DriverMatchingStrategy driverMatchingStrategy, PricingStrategy priceStrategy, Double price, Location destination, Location source, Driver tripDriver, Rider rider) {
        this.driverMatchingStrategy = driverMatchingStrategy;
        this.priceStrategy = priceStrategy;
        this.price = price;
        this.destination = destination;
        this.source = source;
        this.tripDriver = tripDriver;
        this.rider = rider;
    }

    @Override
    public String toString(){
        return "{"
                   + "{ Rider: " + rider.getName() + "}"
                   + "{ Driver: " + tripDriver.getName() + "}"
                   + "{ Price: " + price + "}" +
                "}";
    }
}
