/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kotenoru
 */
public class BrokenTest {
    
    public BrokenTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInput() {
        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('a');
        caracteres.add('b');
        caracteres.add('c');
        caracteres.add('d');
        Broken prueba;
        prueba = new Broken(caracteres);
        assertEquals("abaca",prueba.largestValidWord());
    }
    public void testInput2() {
        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('q');
        caracteres.add('w');
        caracteres.add('e');
        caracteres.add('r');
        Broken prueba;
        prueba = new Broken(caracteres);
        assertEquals("weewee",prueba.largestValidWord());
    }
    public void testInput3() {
        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('h');
        caracteres.add('j');
        caracteres.add('k');
        caracteres.add('l');
        caracteres.add('o');
        Broken prueba;
        prueba = new Broken(caracteres);
        assertEquals("holloo",prueba.largestValidWord());
    }    
}
