package Decorator;

/**
 * Created by Jonathan on 6/14/2014.
 */
public class WhippedDecorator extends BeverageDecorator {
    public WhippedDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whipped cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .10;
    }
}
