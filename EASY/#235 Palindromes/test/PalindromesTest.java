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
public class PalindromesTest {
    
    public PalindromesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }



    @Test
    public void testIsPalindrom() {
        Palindromes testuno = new Palindromes("jose esoj");
        assertEquals(true,testuno.isPalindrom());
    }

    @Test
    public void testRemoveNotLettersAndLowerCase() {
        Palindromes testuno = new Palindromes("Asereje, ja de je, dejebe!");
        testuno.removeNotLettersAndLowerCase();
        assertEquals("aserejejadejedejebe",testuno.getInput());
    }
    @Test
    public void testInput1() {
        Palindromes testuno = new Palindromes("Was it a car\nor a cat\nI saw?");
        assertEquals(true,testuno.isPalindrom());
    }
    @Test
    public void testInput2() {
        Palindromes testuno = new Palindromes("A man, a plan, \n" +
                                              "a canal, a hedgehog, \n" +
                                              "a podiatrist, \n" +
                                              "Panama!");
        assertEquals(false,testuno.isPalindrom());
    } 
    @Test
    public void challenge1() {
        Palindromes testuno = new Palindromes("Are we not drawn onward, \n" +
                                              "we few, drawn onward to new area?");
        assertEquals(false,testuno.isPalindrom());
    }
    @Test
    public void challenge2() {
        Palindromes testuno = new Palindromes("Dammit I’m mad.\n" +
                                            "Evil is a deed as I live.\n" +
                                            "God, am I reviled? I rise, my bed on a sun, I melt.\n" +
                                            "To be not one man emanating is sad. I piss.\n" +
                                            "Alas, it is so late. Who stops to help?\n" +
                                            "Man, it is hot. I’m in it. I tell.\n" +
                                            "I am not a devil. I level “Mad Dog”.\n" +
                                            "Ah, say burning is, as a deified gulp,\n" +
                                            "In my halo of a mired rum tin.\n" +
                                            "I erase many men. Oh, to be man, a sin.\n" +
                                            "Is evil in a clam? In a trap?\n" +
                                            "No. It is open. On it I was stuck.\n" +
                                            "Rats peed on hope. Elsewhere dips a web.\n" +
                                            "Be still if I fill its ebb.\n" +
                                            "Ew, a spider… eh?\n" +
                                            "We sleep. Oh no!\n" +
                                            "Deep, stark cuts saw it in one position.\n" +
                                            "Part animal, can I live? Sin is a name.\n" +
                                            "Both, one… my names are in it.\n" +
                                            "Murder? I’m a fool.\n" +
                                            "A hymn I plug, deified as a sign in ruby ash,\n" +
                                            "A Goddam level I lived at.\n" +
                                            "On mail let it in. I’m it.\n" +
                                            "Oh, sit in ample hot spots. Oh wet!\n" +
                                            "A loss it is alas (sip). I’d assign it a name.\n" +
                                            "Name not one bottle minus an ode by me:\n" +
                                            "“Sir, I deliver. I’m a dog”\n" +
                                            "Evil is a deed as I live.\n" +
                                            "Dammit I’m mad.");
        assertEquals(true,testuno.isPalindrom());
    } 
}
