/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
     * Test of sendEmail method, of class TicketEmailer.
     */
    @Test
    public void testSendEmail() {
        System.out.println("sendEmail");
        TicketEmailer instance = new TicketEmailer();
        
        instance.sendEmail();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TicketEmailer.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ObservableTicket value = null;
        TicketEmailer instance = new TicketEmailer();
        instance.update(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
