/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deni
 */
public class MilitaryService  implements NationalService{
     int dayLeft;

    public MilitaryService(int day) {
    this.dayLeft = day;
    }
    
    
    @Override
    public int getDaysLeft(){
    
        return dayLeft;
    }
    
    @Override
    public void work(){
    
    if(dayLeft >= 1){
      dayLeft--;
    }
    }
    
}
