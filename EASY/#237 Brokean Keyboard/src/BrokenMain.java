
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotenoru
 */
public class BrokenMain {
    
    List<String> palabras;
    ArrayList<String> teclas;
    
    
    public BrokenMain(){
    }
    
    public BrokenMain(String args){
        
        Broken testbroken;
        ArrayList<Character> intento;
        this.palabras = new ArrayList<>();
        
        //Procesamos los argumentos 
        this.teclas = new ArrayList<>(Arrays.asList(args.split(" ")));
        
        //Procesamos el indice que nos dice el número de palabras
        Integer size = Integer.parseInt(teclas.get(0));
        this.teclas.remove(0);
        
        //Almacenamos las teclas 
        
        //Saltamos el primer elemento que es el numero de palabras y llegamos hasta ese numero
        for (int i=0; i < size; i++){
           intento = new ArrayList<>();
           for(char _char : teclas.get(i).toCharArray()){
               intento.add(_char);
           }
           testbroken = new Broken(intento);
           this.palabras.add(testbroken.largestValidWord());
        }
    }
    
    public String formatOutput() {
        String devolver = "";
        for (int i = 0; i < this.teclas.size(); i++){
            devolver += String.format("%s = %s\n",this.teclas.get(i),this.palabras.get(i));
        }
        
        return devolver;
    }
    
    
}
