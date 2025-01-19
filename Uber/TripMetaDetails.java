package Uber;

import Uber.UserImpl.Rider;

public class TripMetaDetails {

    private Rider rider;
    private Location source;
    private Location destination;


    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public TripMetaDetails(Rider rider, Location source, Location destination){
        this.rider = rider;
        this.source = source;
        this.destination = destination;
    }

}
