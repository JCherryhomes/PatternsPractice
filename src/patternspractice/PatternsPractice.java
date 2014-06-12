/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patternspractice;

import Decorator.*;

/**
 *
 * @author Jonathan
 */
public class PatternsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Water water = new Water();
        System.out.println(water.getDescription());
        
        WithIceDecorator withIce = new WithIceDecorator(water);
        System.out.println(withIce.getDescription());
        
        WithCherryDecorator withCherry = new WithCherryDecorator(withIce);
        System.out.println(withCherry.getDescription());
    }
    
}
