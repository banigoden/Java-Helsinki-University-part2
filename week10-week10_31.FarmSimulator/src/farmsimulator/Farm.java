/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author Deni
 */
class Farm implements Alive{
    private Barn barn;
    private String name;
    private ArrayList<Cow> cows;

    public Farm(String name, Barn barn){
    
        this.name = name;
        this.barn = barn; 
        cows = new ArrayList<Cow>();
        
    }
    public String getOwner(){
    
        return name;
    
    }
    public void addCow(Cow cow){
    
        cows.add(cow);
        
    }
    
    @Override
    public void liveHour() {
        
       for(Cow cow : cows){
       
           cow.liveHour();
       }
    }
    
    public void manageCows(){
    
        barn.takeCareOf(cows);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        
        barn.installMilkingRobot(milkingRobot);
    }
    
    @Override
    public String toString(){
        String output = "Farm owner: " + getOwner() +"\n" + "Barn bulk tank: " + barn.toString() +"\n" + "Animals:";
    
        for(Cow cow : cows){
        
            output += "\n        " + cow.toString();
        }
        return  output;
        
    }
    
}
