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
    public IBeverage beverage;
    
    @Override
    public abstract String getDescription();
}
