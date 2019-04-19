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
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank(){
    capacity = 2000;
    volume = 0;
    }

    
    public BulkTank(double capacity){
        this.capacity = capacity;
    }
    public double getCapacity(){
     return capacity;
    }
public double getVolume(){
    return volume;
}
public double howMuchFreeSpace(){   
 double freeSize = capacity - volume;
    return freeSize;
}
public void addToTank(double amount){
    
    volume += amount;
    if(volume > capacity){
        volume = capacity;
    }
}
public double getFromTank(double amount){
    
    volume -= amount;
    if(volume < 0){
    volume = 0;
    }
    
    return volume;

}
@Override
public String toString(){

    return Math.ceil(volume) + "/" +Math.ceil(capacity);
}
}
