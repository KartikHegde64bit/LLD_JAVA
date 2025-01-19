package Uber;

import Uber.UserImpl.Driver;
import Uber.UserImpl.Rider;

public class TripManager {
    // following single ton pattern
    public static TripManager tripManagerInstance = null;

    public static TripManager getTripManager() {
        // using double-locking thread safe mechanism
        if(tripManagerInstance == null) {
            synchronized (TripManager.class) {
                if(tripManagerInstance == null){
                    tripManagerInstance = new TripManager();
                }
            }
        }
        return tripManagerInstance;
    }

    public Trip createTrip(Rider rider, Location source, Location destination){
        // get the strategy manager
        StrategyManager strategyManager = StrategyManager.getStrategyManager();
        TripMetaDetails tripMeta = new TripMetaDetails(rider, source, destination);

        DriverMatchingStrategy driverMatchingStrategy = strategyManager.getDriverStrategy(tripMeta);
        PricingStrategy priceStrategy = strategyManager.getPriceStrategy(tripMeta);

        Double tripPrice = priceStrategy.calculatePrice(tripMeta);
        Driver tripDriver = driverMatchingStrategy.matchDriver(tripMeta);

        Trip trip = new Trip(driverMatchingStrategy, priceStrategy, tripPrice, destination, source, tripDriver, rider);
        return trip;
    }
}
