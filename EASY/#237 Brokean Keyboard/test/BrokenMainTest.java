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
public class BrokenMainTest {
    
    public BrokenMainTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInput() {
        String input = "3 abcd qwer hjklo";
        String expected = "abcd = abaca\nqwer = weewee\nhjklo = holloo\n";
        BrokenMain testInput = new BrokenMain(input);
        assertEquals(expected,testInput.formatOutput());
    }
    public void testChallenge() {
        String input = "4 edcf bnik oil nvybu";
        String expected = "edcf = deeded\nbnik = bikini\noil = lollipop\nvybu = bubby";
        BrokenMain testInput = new BrokenMain(input);
        assertEquals(expected,testInput.formatOutput());
    }   
    
}
