package Uber;

import Uber.UserImpl.Rider;

public class Application {
    public static void main(String[] args){
        // code goes here
        Location src = new Location(10, 20);
        Location dest = new Location(15, 30);

        Rider rider = new Rider("Alex", "678", 4.0, "PREMIUM");
        TripManager tripManager = TripManager.getTripManager();
        Trip trip = tripManager.createTrip(rider, src, dest);
        System.out.println(trip.toString());
    }
}
