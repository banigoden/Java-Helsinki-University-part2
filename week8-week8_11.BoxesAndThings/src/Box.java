
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deni
 */
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList <ToBeStored> box;
    
    
    
    public Box(double weight){
        
        this.maxWeight = weight;
        box = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored boxes){
         
        if(this.weight() + boxes.weight() < maxWeight){
            
            this.box.add(boxes);
        }
        
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(ToBeStored  w: this.box){
           weight += w.weight();
        }
        return  weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + box.size() + " things, total weight " + weight() +" kg";
    }
}
