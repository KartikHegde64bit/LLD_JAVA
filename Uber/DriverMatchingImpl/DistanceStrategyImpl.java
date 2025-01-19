package Uber.DriverMatchingImpl;

import Uber.DriverMatchingStrategy;
import Uber.TripMetaDetails;
import Uber.UserImpl.Driver;

public class DistanceStrategyImpl implements DriverMatchingStrategy {
    public Driver matchDriver(TripMetaDetails tripMeta){
        return new Driver("DistanceDriver");
    }
}
