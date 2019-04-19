
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
public class RingingCentre {
    
    private  Map<Bird, List<String>> birdInfoPlace;
    
    public RingingCentre() {
        this.birdInfoPlace = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
    
        if(!birdInfoPlace.containsKey(bird)){
        
             birdInfoPlace.put(bird, new ArrayList<String>());
        }
        birdInfoPlace.get(bird).add(place);
        
        
    }
    
    public void observations(Bird bird){
        
       
       System.out.print(bird.toString() + " observations: " );
       
       if(!birdInfoPlace.containsKey(bird)){
           System.out.println("0");
       }
       else {
       
           System.out.println(birdInfoPlace.get(bird).size());
           
           for(String place : birdInfoPlace.get(bird)){
           System.out.println(place);
       }
       }
       
       
       
    }
   
    
}
