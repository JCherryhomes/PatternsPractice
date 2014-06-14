/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patternspractice;

import Decorator.Water;
import Decorator.WithCherryDecorator;
import Decorator.WithIceDecorator;
import Observer.ObservableTicket;
import Observer.TicketEmailer;

/**
 *
 * @author Jonathan
 */
public class PatternsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //runDecoratorPractice();
        runObservablePractice();
    }
    
    /**
     * Runs code that exercises the decorator classes
     */
    public static void runDecoratorPractice(){
        Water water = new Water();
        System.out.println(water.getDescription());
        
        WithIceDecorator withIce = new WithIceDecorator(water);
        System.out.println(withIce.getDescription());
        
        WithCherryDecorator withCherry = new WithCherryDecorator(withIce);
        System.out.println(withCherry.getDescription());
    }
    
    /**
     * Runs code that exercises the observer/observable classes
     */
    public static void runObservablePractice(){
        ObservableTicket ticket = new ObservableTicket();
        TicketEmailer emailer = new TicketEmailer();
        ticket.register(emailer);
        
        ticket.setTicketNumber(5);
        ticket.setTicketName("Ticket One");
        
        ticket.saveTicket();
    }
}
