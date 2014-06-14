package Decorator;

/**
 * Created by Jonathan on 6/14/2014.
 */
public class HouseBlend implements IBeverage {
    @Override
    public String getDescription() {
        return "House blend coffee";
    }

    @Override
    public double getCost() {
        return .99;
    }
}
