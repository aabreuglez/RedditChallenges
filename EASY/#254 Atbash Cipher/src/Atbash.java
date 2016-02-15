/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotenoru
 */
public class Atbash {
    
    //We need to look the opposit element in the alphabet
    
    private static final String ALPHABET =         "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    private static final String CIPHEREDALPHABET = "ZzYyXxWwVvUuTtSsRrQqPpOoNnMmLlKkJjIiHhGgFfEeDdCcBbAa";
    private String phrase;

    public Atbash() {
    }

    public Atbash(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
    
    public String applyCipher(){
        
        StringBuilder devolver= new StringBuilder();
        Integer alphabetindex;
        
        
        for (char c : this.phrase.toCharArray()){
            
           alphabetindex = Atbash.ALPHABET.indexOf(Character.toString(c));
           
           if( alphabetindex != -1){
               
               devolver.append(Atbash.CIPHEREDALPHABET.charAt(alphabetindex));
               
           }
           else {
               
               devolver.append(Character.toString(c));
               
           }
           
        }
                
        return devolver.toString();
    }
}
