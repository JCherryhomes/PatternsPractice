/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorator;


public class WithCherryDecorator extends BeverageDecorator {
    public WithCherryDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "cherry flavored " + beverage.getDescription();
    }

    @Override
    public double getCost() {
        return .10;
    }

}
