
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotenoru
 */
public class EasyFunnyPlant {
    
    public int people;
    public ArrayList<Plant> plants;

    public EasyFunnyPlant() {
        
    }
    public EasyFunnyPlant(int people, int fruits) {
        this.people = people;
        this.plants = new ArrayList<>();
        harvestPlants(fruits);
    }
    
    public void harvestPlants(Integer number){
        Plant temp;
        for (int i=0; i < number; i++){
            temp = new Plant();
            plants.add(temp);
        }
    }
    
    public Integer calculateWeeks(){
        Integer weeks = 0;
        
        while (this.plants.size() < people){
            for(int i=0; i < plants.size(); i++){
                harvestPlants(plants.get(i).getWeeks());
                plants.get(i).grow();
            }
            weeks +=1;
        }
        return weeks;
    }
}
