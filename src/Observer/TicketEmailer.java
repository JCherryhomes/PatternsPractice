/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

/**
 *
 * @author Jonathan
 */
public class TicketEmailer extends EmailObserver<ObservableTicket> {
    private ObservableTicket ticket;
    
    @Override
    public void sendEmail() {
        System.out.println("Email sent for ticket " + ticket.getTicketNumber() + " (" + ticket.getTicketName() + ")");
    }

    @Override
    public void update(ObservableTicket value) {
        this.ticket = value;
        sendEmail();
    }
    
}
