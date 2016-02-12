
import java.util.ArrayList;
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
public class DeficientNumbers {
    Integer testnumber;

    public DeficientNumbers() {
    }

    public void setTestnumber(Integer testnumber) {
        this.testnumber = testnumber;
    }

    public Integer getTestnumber() {
        return testnumber;
    }
    
    public String typeofNumber(){
        String devolver="";
        List divisors;
        Integer suma;
        Integer result;
        
        //calculate all number divisor
        divisors = calculateDivisors();
        
        //calculate sum
        suma = sumDivisor(divisors);
        
        //decide result
        result = suma - (2 * this.testnumber);
        
        
        /**
         * 111 ~~neither~~ deficient 
         * 112 abundant by 24
         * 220 abundant by 64
         *  69 deficient
         * 134 deficient
         *  85 deficient
         */
        
        if(result > 0){
            devolver += String.format("%s abundant by %s", this.testnumber, result);
        }
        else if(result < 0){
            devolver += String.format("%s deficient", this.testnumber);
        }
        else{
            devolver += String.format("%s Perfect", this.testnumber);
        }
        
        return devolver;
    }
    
    public List calculateDivisors(){
        List divisors = new ArrayList<Integer>();
        for(int i = 1; i <= this.testnumber; i++){
            if (testnumber % i == 0){
                divisors.add(i);                
            }
        }
        
        return divisors;
    }
    
    public Integer sumDivisor(List<Integer> input){
        Integer suma=0;
        
        for (int i = 0; i < input.size(); i++){
            suma += input.get(i);
        }
        
        return suma;
    }
    
}
