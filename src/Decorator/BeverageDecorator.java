package Decorator;

/**
 * Created by Jonathan on 6/14/2014.
 */
public abstract class BeverageDecorator implements IBeverage {
    IBeverage beverage;

    public BeverageDecorator(IBeverage beverage){
        this.beverage = beverage;
    }
}
