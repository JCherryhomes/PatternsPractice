/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patternspractice;

import Decorator.*;
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
        // TODO code application logic here
        runObservablePractice();
    }
    
    public static void runDecoratorPractice(){
        Water water = new Water();
        System.out.println(water.getDescription());
        
        WithIceDecorator withIce = new WithIceDecorator(water);
        System.out.println(withIce.getDescription());
        
        WithCherryDecorator withCherry = new WithCherryDecorator(withIce);
        System.out.println(withCherry.getDescription());
    }
    
    public static void runObservablePractice(){
        ObservableTicket ticket = new ObservableTicket();
        TicketEmailer emailer = new TicketEmailer();
        ticket.register(emailer);
        
        ticket.setTicketNumber(5);
        ticket.setTicketName("Ticket One");
        
        ticket.saveTicket();
    }
}
