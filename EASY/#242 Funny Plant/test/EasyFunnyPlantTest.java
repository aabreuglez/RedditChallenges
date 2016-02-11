/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kotenoru
 */
public class EasyFunnyPlantTest {
    
    public EasyFunnyPlantTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test

    public void testInput() {
        EasyFunnyPlant input = new EasyFunnyPlant(15,1);
        Integer output = input.calculateWeeks();
        Integer expected = new Integer(5);
        assertEquals(expected, output);
    }

    public void testChallenge() {
        EasyFunnyPlant input = new EasyFunnyPlant(200,15);
        Integer output = input.calculateWeeks();
        Integer expected = new Integer(5);
        assertEquals(expected, output);        
    }
    
    public void testChallenge2() {
        EasyFunnyPlant input = new EasyFunnyPlant(50000,1);
        Integer output = input.calculateWeeks();
        Integer expected = new Integer(14);
        assertEquals(expected, output);        
    }
    
    public void testChallenge3() {
        EasyFunnyPlant input = new EasyFunnyPlant(150000,250);
        Integer output = input.calculateWeeks();
        Integer expected = new Integer(9);
        assertEquals(expected, output);        
    }
}
