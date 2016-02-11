import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kotenoru
 */
public class EasyPlayingTheStockMarket {



    /**
     * @param args the command line arguments
     */
    private String _input1;
    
    public EasyPlayingTheStockMarket(String _input1) {
        this._input1 = _input1;
    }
    public String getInput1() {
        return _input1;
    }

    public void setInput1(String input1) {
        this._input1 = input1;
    }
        
    public ArrayList<Double> market(){
        //For assertions
        ArrayList<Double> devolver = new ArrayList<Double>();
        
        //Parsing string value to ArrayList of Double
        List<Double> temp = Stream.of(_input1.split(" ")).map(Double::parseDouble).collect(toList());
        ArrayList<Double> numbers = new ArrayList<Double>(temp);
        
        int min=0;
        int max=0;
        Double diff=9999999.99;
        
        //The purpose is to get the mayor benefit, buy low, sell high
        for (int i=0; i < numbers.size(); i++){    
            //We have to wait 1 turn per selling so i+2
            for(int j = i+2; j < numbers.size(); j++){
                if (numbers.get(i) - numbers.get(j) < diff){
                    diff = numbers.get(i) - numbers.get(j);
                    max = j;
                    min = i;
                }
                              
            }
        }
        
        devolver.add(numbers.get(min));
        devolver.add(numbers.get(max));
        
        return devolver;
    }
    
}
