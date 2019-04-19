/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Deni
 */
public class Barn {
   private BulkTank tank;
   private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
        
        this.tank = tank;
        
    }
public BulkTank getBulkTank(){
    
    return tank;
    
}
public void installMilkingRobot(MilkingRobot milkingRobot) {
    this.milkingRobot = milkingRobot;
    
    this.milkingRobot.setBulkTank(tank);
    
}
public void takeCareOf(Cow cow){
    
    if(milkingRobot == null){
        throw new IllegalStateException();
    }else{
    
    milkingRobot.milk(cow);

}

}
public void takeCareOf(Collection<Cow> cows){
    
    if(milkingRobot == null){
       throw new IllegalStateException();
    }else{
    
        for(Cow cow : cows){
        
            milkingRobot.milk(cow);
        }
    }
}

    @Override
    public String toString(){

        return tank.toString() ;
    }

    
}
