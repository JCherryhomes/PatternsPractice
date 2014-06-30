package Decorator;

/**
 * Created by Jonathan on 6/14/2014.
 */
public class MochaDecorator extends BeverageDecorator {
    public MochaDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .20;
    }
}
