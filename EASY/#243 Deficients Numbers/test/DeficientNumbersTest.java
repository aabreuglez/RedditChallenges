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
public class DeficientNumbersTest {
    
    public DeficientNumbersTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInput() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(18);
        assertEquals("18 abundant by 3",input.typeofNumber());
    }
    
    @Test
    public void testInput2() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(21);
        assertEquals("21 deficient",input.typeofNumber());
    }
    
    @Test
    public void testInput3() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(6);
        assertEquals("6 Perfect",input.typeofNumber());
    }
    
    /**
     * 111 ~~neither~~ deficient 
     * 112 abundant by 24
     * 220 abundant by 64
     *  69 deficient
     * 134 deficient
     *  85 deficient
     */

    @Test
    public void testChallenge1() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(111);
        assertEquals("111 deficient",input.typeofNumber());
    } 

    @Test
    public void testChallenge2() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(112);
        assertEquals("112 abundant by 24",input.typeofNumber());
    }  
    
    @Test
    public void testChallenge3() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(220);
        assertEquals("220 abundant by 64",input.typeofNumber());
    }  
    
    @Test
    public void testChallenge4() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(69);
        assertEquals("69 deficient",input.typeofNumber());
    }  
        
    @Test
    public void testChallenge5() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(134);
        assertEquals("134 deficient",input.typeofNumber());
    }  
    
    @Test
    public void testChallenge6() {
        DeficientNumbers input;
        input = new DeficientNumbers();
        
        input.setTestnumber(85);
        assertEquals("85 deficient",input.typeofNumber());
    }  


}
