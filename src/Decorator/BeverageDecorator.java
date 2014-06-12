/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorator;

/**
 *
 * @author Jonathan
 */
public abstract class BeverageDecorator implements IBeverage {
    private IBeverage beverage;
    
    @Override
    public abstract String getDescription();
    
    public IBeverage getBeverage(){
        return this.beverage;
    }
    
    public void setBeverage(IBeverage beverage){
        this.beverage = beverage;
    }
}
