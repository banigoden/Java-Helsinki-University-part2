/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.*;

/**
 *
 * @author Deni
 */
public class Teacher extends Person{
    
    private Map <String, Integer> salar;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        salar = new HashMap<String, Integer>();
        salar.put(name, salary);
    }
    @Override
    public String toString(){
    String names = "";
        for(String name : salar.keySet()){
            names +=name;
        }
    return super.toString() + "\n" +  "  salary " + salar.get(names) + " euros/month";
    }
    
}
