import static java.lang.Character.isLetter;
import java.util.ArrayList;
import java.util.Random;

public class Topoglycemia {

    public static void main(String[] args) {
        String test="According to a research team at Cambridge University, it doesn't matter in what order the letters in a word are,\n the only important thing is that the first and last letter be in the right place.\n The rest can be a total mess and you can still read it without a problem.\n This is because the human mind does not read every letter by itself, but the word as a whole.\n Such a condition is appropriately called Typoglycemia.";
        String[] parts = test.split(" ");
        String[] result;
        int j=0;
        result = new String[parts.length];
        int k=0;
        int lastletter;
        
        
        for (String word : parts)
        {     
            lastletter = calculatelastletter(word);
          
            result[j]=mergemiddle(word,lastletter);
            
            j++;
        }
        String joined = String.join(" ",result);
        System.out.println("OUTPUT:" + joined);
        
    }
    
    public static int calculatelastletter(String caracteres)
    {
        int lastletter;
        lastletter = caracteres.length();
        boolean ok = false;
        
        for( int i=caracteres.length()-1; i>0 && !ok; i--)
        {
          if (isLetter(caracteres.charAt(i))){
              lastletter = i;
              ok = true;
          }
        }
        return lastletter;
    }
    public static String mergemiddle (String caracteres,int lastletter){        
        
        StringBuilder randomBag;
        char[] c=caracteres.toCharArray();
        int index=0;
        
        randomBag = new StringBuilder(caracteres.substring(1,lastletter));
        for(int i=1;i<lastletter;i++){
            index=(int)Math.rint(((randomBag.length()-1)*Math.random()));
            c[i]=randomBag.charAt(index);
            randomBag.deleteCharAt(index);
        }
        String merged = new String(c);
        return merged;
    }
}