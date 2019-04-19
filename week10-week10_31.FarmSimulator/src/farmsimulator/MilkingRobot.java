/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Deni
 */
class MilkingRobot {
     private BulkTank balkTank;
    
    public MilkingRobot(){
    
       
        
    }
    public BulkTank getBulkTank(){
        
        return balkTank;
    }
    
    public void setBulkTank(BulkTank tank){
        balkTank = tank;
    }
    
    public void milk(Milkable milkable){
        
        if(balkTank == null){
        
            throw new IllegalStateException();
        }
        balkTank.addToTank(milkable.milk());
    }
    
}
