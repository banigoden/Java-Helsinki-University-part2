/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Deni
 */
public class ContainerHistory {
    
   private ArrayList<Double> info;
    
    public ContainerHistory(){
    
        info = new ArrayList<Double>();
    }
    public void add(double situation) {
    
        info.add(situation);
    }
    
    public void reset(){
    
        info.clear();
    }
    
    public double maxValue(){
        double max = 0;
     if(info.isEmpty()){
         
    }else{
        
       for(double ma : info){
       
           if(ma > max){
           max = ma;
           }
       }
     }
        return max;
    }
    
    public double minValue(){
        double min = 0;
    if(info.isEmpty()){
       
    }else{
        min = info.get(0);
             for(double mi : info ){
                if(min > mi ){
                    min = mi;
                    }  
                
                }
            }
    return min;
    }
        
    
    
    public double average(){
     double average = 0;
        if(info.isEmpty()){
            
    }else{
        for(double ave : info){
        
            average+=ave;
        }
        }
        return average/info.size();
    }
    
    public double greatestFluctuation(){
    if (info.size() <= 1) {
            return 0;
        }
        
        double maxFluctuation = 0;
        
        for (int i = 1; i < info.size(); i++) {
            double diff = Math.abs(info.get(i) - info.get(i - 1));
            
            if (diff > maxFluctuation) {
                maxFluctuation = diff;
            }
        }
        
        return maxFluctuation;
    
    }
    
    public double variance(){
    if (info.size() <= 1) {
            return 0;
        }
        
        double average = average();
        double variance = 0;
        
        for (Double d : info) {
            variance += Math.pow((d - average), 2);
        }
        variance /= (info.size() - 1);
        
        return variance;
    }
    
    @Override
    public String toString(){
        return info.toString();
    }
    
}
