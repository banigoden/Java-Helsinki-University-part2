/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deni
 */
public class CivilService implements NationalService{
    
    int day;

    public CivilService() {
     day = 362;
    }
    
    
    @Override
    public int getDaysLeft(){
  
        return day;
    }
    
    @Override
    public void work(){
    
    if(day >= 1){
    day--;
    }
    }
    
}
