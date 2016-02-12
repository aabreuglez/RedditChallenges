/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotenoru
 */
public class SailorsAndMonkey {
    private Integer coconuts;
    private Integer sailors;

    public SailorsAndMonkey() {
    }
    
    public SailorsAndMonkey(Integer sailors) {
        this.sailors = sailors;
        this.coconuts = sailors; 
        //Lets think in the morning no coconut remains, so the initial number of coconuts will be 0,we will forget an iterarion in order to 
    }
    
    public Integer howMuchCoconuts(){
        Integer monkeycoconuts = 0;
        //If no monkey there, we just should multiply by N each time
        for (int i =0; i < (this.sailors - 1); i++){
            this.coconuts *= this.sailors;
            monkeycoconuts += 1; //But we are giving 1 to the monkey eachtimes

        }
        this.coconuts -= monkeycoconuts;
        
        return this.coconuts;
    }
    
    
    
}
