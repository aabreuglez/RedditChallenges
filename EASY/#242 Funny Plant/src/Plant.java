/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotenoru
 */
public class Plant {
    int weeks;

    public Plant() {
        this.weeks = 0;
    }

    
    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }
    
    public void grow() {
        this.weeks += 1;
    }
    
}
