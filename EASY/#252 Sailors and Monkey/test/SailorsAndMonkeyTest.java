/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kotenoru
 */
public class SailorsAndMonkeyTest {
    
    public SailorsAndMonkeyTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testHowMuchCoconuts() {
        SailorsAndMonkey sample = new SailorsAndMonkey(5);
        assertEquals(Integer.valueOf(3121),sample.howMuchCoconuts());
    }
    
    @Test
    public void testHowMuchCoconuts2() {
        SailorsAndMonkey sample = new SailorsAndMonkey(2);
        assertEquals(Integer.valueOf(3),sample.howMuchCoconuts());
    }
    
    @Test
    public void testHowMuchCoconuts3() {
        SailorsAndMonkey sample = new SailorsAndMonkey(3);
        assertEquals(Integer.valueOf(25),sample.howMuchCoconuts());
    }
    
    @Test
    public void testHowMuchCoconuts4() {
        SailorsAndMonkey sample = new SailorsAndMonkey(4);
        assertEquals(Integer.valueOf(253),sample.howMuchCoconuts());
    }         
}
