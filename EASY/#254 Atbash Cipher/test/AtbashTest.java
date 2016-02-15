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
public class AtbashTest {
    
    public AtbashTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testApplyCipher() {
        Atbash testuno;
        testuno = new Atbash("foobar");
        assertEquals("ullyzi",testuno.applyCipher());
    }

    @Test
    public void testApplyCipher2() {
        Atbash testuno;
        testuno = new Atbash("wizard");
        assertEquals("draziw",testuno.applyCipher());
    }
    
    @Test
    public void testApplyCipher3() {
        Atbash testuno;
        testuno = new Atbash("/r/dailyprogrammer");
        assertEquals("/i/wzrobkiltiznnvi",testuno.applyCipher());
    }   

    @Test
    public void testApplyCipher4() {
        Atbash testuno;
        testuno = new Atbash("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi");
        assertEquals("this is an example of the atbash cipher",testuno.applyCipher());
    }       
}
