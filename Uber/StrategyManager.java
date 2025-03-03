package Uber;

import Uber.DriverMatchingImpl.DistanceStrategyImpl;
import Uber.DriverMatchingImpl.RatingStrategyImpl;
import Uber.PricingStrategyImpl.PlanBasedPricingStrategy;
import Uber.PricingStrategyImpl.DistancePricingStrategy;

public class StrategyManager {
    private static StrategyManager strategyManagerInstance;

    public static synchronized StrategyManager getStrategyManager(){
        if(strategyManagerInstance == null){
            strategyManagerInstance = new StrategyManager();
        }
        return strategyManagerInstance;
    }
    
    public DriverMatchingStrategy getDriverStrategy(TripMetaDetails tripMeta){
        DriverMatchingStrategy driverMatchingStrategy = null;
        try{
            if(tripMeta.getRider().getPlan().equals("PREMIUM")){
                driverMatchingStrategy = new DistanceStrategyImpl();
            } else {
                driverMatchingStrategy = new RatingStrategyImpl();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while assigning driver strategy");
        }
        return driverMatchingStrategy;
    }

    public PricingStrategy getPriceStrategy(TripMetaDetails tripMeta){
        PricingStrategy pricingStrategy = null;
        try{
            if(tripMeta.getRider().getPlan().equals("PREMIUM")){
                pricingStrategy = new PlanBasedPricingStrategy();
            } else {
                pricingStrategy = new DistancePricingStrategy();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while assigning driver strategy");
        }
        return pricingStrategy;
    }
}
