
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotenoru
 */
public class Broken {
    private Set<Character> teclas;

    public Broken(ArrayList<Character> teclas) {
        this.teclas = new HashSet(teclas);
    }
    
    public String largestValidWord(){
        String devolver="";
        
        Set<Character> mySet;
        
        File file = new File("E:\\NetBeansProjects\\#237 Broken Keyboard\\enable1.txt");
        BufferedReader reader = null;

        List<Character> list = new ArrayList<Character>();    
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            //Creamos un conjunto con los caracteres leidos y comprobamos si coinciden con el teclado
            while ((text = reader.readLine()) != null) {
                
                mySet = new HashSet<Character>();
                
                for( char a: text.toCharArray() ){
                    mySet.add(a);
                }
                
                mySet.removeAll(this.teclas);
                
                if ( mySet.isEmpty())  {
                    //Si el conjunto ha quedado vacío, solo se usan las teclas del teclado
                    if (text.length() > devolver.length()) {
                        devolver = text;
                    }
                } 
            }
            
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        
        return devolver;
    }
}
