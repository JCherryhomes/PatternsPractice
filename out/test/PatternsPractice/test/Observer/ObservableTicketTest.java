/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jonathan
 */
public class ObservableTicketTest {
    
    public ObservableTicketTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getTicketNumber method, of class ObservableTicket.
     */
    @Test
    public void testGetTicketNumber() {
        System.out.println("getTicketNumber");
        ObservableTicket instance = new ObservableTicket();
        int expResult = 0;
        int result = instance.getTicketNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTicketNumber method, of class ObservableTicket.
     */
    @Test
    public void testSetTicketNumber() {
        System.out.println("setTicketNumber");
        int ticketNumber = 5;
        ObservableTicket instance = new ObservableTicket();
        instance.setTicketNumber(ticketNumber);
        
        assertEquals(ticketNumber, instance.getTicketNumber());
    }

    /**
     * Test of getTicketName method, of class ObservableTicket.
     */
    @Test
    public void testGetTicketName() {
        System.out.println("getTicketName");
        ObservableTicket instance = new ObservableTicket();
        String expResult = "Test";
        instance.setTicketName(expResult);
        String result = instance.getTicketName();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class ObservableTicket.
     */
    @Test
    public void testRegisterAndRemoveObservers() {
        System.out.println("remove");
        IObserver<ObservableTicket> observer = new TicketEmailer();
        ObservableTicket instance = new ObservableTicket();
        instance.register(observer);
        
        assertThat(instance.observers.isEmpty(), not(is(true)));
        
        instance.remove(observer);
        
        assertThat(instance.observers.isEmpty(), is(true));
    }
    
}
