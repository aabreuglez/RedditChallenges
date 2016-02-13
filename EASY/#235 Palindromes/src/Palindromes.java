/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Kotenoru
 */
public class Palindromes {
    private String input;

    public Palindromes() {
    }

    public Palindromes(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public Boolean isPalindrom(){
        
        Boolean devolver = false;
        ArrayList<String> substrings;
        
        //First we use regex for remove not letters and Lower Case
        removeNotLettersAndLowerCase();
        
        substrings = splitInTwo();

       
       if( substrings.get(0).equals(substrings.get(1)) ){
           devolver = true;
       }   
        
        return devolver;
    }
    
    public ArrayList<String> splitInTwo(){
    //Now we need to split the string in two
    ArrayList<String> devolver = new ArrayList<>();

    if(this.input.length()%2==0){
        devolver.add(this.input.substring(0, (this.input.length() / 2) ));
        devolver.add(this.input.substring( (this.input.length() / 2), this.input.length() ) );
    }
    
    else{
        devolver.add(this.input.substring(0, (this.input.length() / 2) ));
        devolver.add(this.input.substring( (this.input.length() / 2) + 1, this.input.length() ) );        
    }
    devolver.set(1,new StringBuilder(devolver.get(1)).reverse().toString());  
    return devolver;
    }
    
    public void removeNotLettersAndLowerCase(){
       this.input = this.input.replaceAll("[^A-Za-z]","");
       this.input = this.input.toLowerCase();
    }
    
    
}
