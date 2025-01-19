package Uber.PricingStrategyImpl;
import Uber.PricingStrategy;
import Uber.TripMetaDetails;

public class PlanBasedPricingStrategy implements PricingStrategy{
    public Double calculatePrice(TripMetaDetails tripMeta){
        return 100.00;
    }
}
