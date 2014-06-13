/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan
 */
public class ObservableTicket implements IObservable<ObservableTicket> {
    private final ArrayList<IObserver<ObservableTicket>> observers;
    private int ticketNumber;
    private String ticketName;
    
    public ObservableTicket(){
        observers = new ArrayList<>();
    }
    
    public int getTicketNumber(){
        return ticketNumber;
    }
    
    public void setTicketNumber(int ticketNumber){
        this.ticketNumber = ticketNumber;
    }
    
    public String getTicketName(){
        return ticketName;
    }
    
    public void setTicketName(String ticketName){
        this.ticketName = ticketName;
    }
    
    public void saveTicket(){
        System.out.println("Ticket saved, notifying observers!");
        notifyObservers();
    }

    @Override
    public void register(IObserver<ObservableTicket> observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver<ObservableTicket> observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void remove(IObserver<ObservableTicket> observer) {
        if (!observers.remove(observer)){
            System.out.println("Observer not found.");
        }
    }
    
}
