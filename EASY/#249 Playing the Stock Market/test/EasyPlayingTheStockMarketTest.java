/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class EasyPlayingTheStockMarketTest {
    
    public EasyPlayingTheStockMarket uno;
    public EasyPlayingTheStockMarket challenge;
    
    public EasyPlayingTheStockMarketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        uno = new EasyPlayingTheStockMarket("19.35 19.30 18.88 18.93 18.95 19.03 19.00 18.97 18.97 18.98 ");
        challenge = new EasyPlayingTheStockMarket("9.20 8.03 10.02 8.08 8.14 8.10 8.31 8.28 8.35 8.34 8.39 8.45 8.38 8.38 8.32 8.36 8.28 8.28 8.38 8.48 8.49 8.54 8.73 8.72 8.76 8.74 8.87 8.82 8.81 8.82 8.85 8.85 8.86 8.63 8.70 8.68 8.72 8.77 8.69 8.65 8.70 8.98 8.98 8.87 8.71 9.17 9.34 9.28 8.98 9.02 9.16 9.15 9.07 9.14 9.13 9.10 9.16 9.06 9.10 9.15 9.11 8.72 8.86 8.83 8.70 8.69 8.73 8.73 8.67 8.70 8.69 8.81 8.82 8.83 8.91 8.80 8.97 8.86 8.81 8.87 8.82 8.78 8.82 8.77 8.54 8.32 8.33 8.32 8.51 8.53 8.52 8.41 8.55 8.31 8.38 8.34 8.34 8.19 8.17 8.16 ");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Market method, of class EasyPlayingTheStockMarket.
     */
    @Test
    public void testMarket() {
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(18.88);
        expResult.add(19.03);
        ArrayList<Double> result = uno.market();
        assertArrayEquals(expResult.toArray(), result.toArray());
    }
    
    @Test
    public void testChallenge() {
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(8.03);
        expResult.add(9.34);
        
        ArrayList<Double> result = challenge.market();
        assertArrayEquals(expResult.toArray(), result.toArray());
    }  
}
