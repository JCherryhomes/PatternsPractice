/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Jonathan
 */
public class TicketEmailerTest {
    
    public TicketEmailerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of update method, of class TicketEmailer.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ObservableTicket value = new ObservableTicket();
        value.setTicketName("Test");
        value.setTicketNumber(2);
        TicketEmailer instance = new TicketEmailer();

        value.register(instance);

        instance.update(value);

        assertThat(instance.ticket.getTicketNumber(), is(2));
    }
    
}
