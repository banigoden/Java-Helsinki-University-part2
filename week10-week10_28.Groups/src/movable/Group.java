/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.*;

/**
 *
 * @author Deni
 */
public class Group implements Movable{

   private List<Movable> points;
    
    public Group(){
    points = new ArrayList<Movable>();
    }
    
    public String toString(){
    String output = "";
        for(Movable m : points){
        
           output += m.toString() + "\n";
        }
        return output;
        
    }
    
    public void addToGroup(Movable movable){
        points.add(movable);
    
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable m : points){
        m.move(dx, dy);
        }
    }
    
}
