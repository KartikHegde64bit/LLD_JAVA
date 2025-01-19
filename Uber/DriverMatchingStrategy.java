package Uber;

import Uber.UserImpl.Driver;

public interface DriverMatchingStrategy {
    public Driver matchDriver(TripMetaDetails tripMeta);
}
