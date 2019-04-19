/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deni
 */
public class ProductContainerRecorder extends ProductContainer{
   
   private ContainerHistory history;

    public ProductContainerRecorder(String juice, double d, double d0) {
        super(juice, d);
        super.addToTheContainer(d0);
        history = new ContainerHistory();
        history.add(d0);
    } 
    
    public String history(){
    
        return history.toString();
    }
    
    public void printAnalysis(){
    
        System.out.println("Product: " + getName());
        System.out.println("History: " + history.toString());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    } 
     @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.history.add(super.getVolume());
    }
    @Override
    public double takeFromTheContainer(double amount){
      double prevVolume = getVolume();
      super.takeFromTheContainer(amount);
      history.add(getVolume());
      
      return prevVolume - getVolume();
    }
    
}
