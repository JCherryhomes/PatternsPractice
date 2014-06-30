/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorator;


public class WithIceDecorator extends BeverageDecorator {
    public WithIceDecorator(IBeverage beverage){
        super(beverage);
    }
    
    @Override
    public String getDescription(){
        return beverage.getDescription() + " with ice ";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
