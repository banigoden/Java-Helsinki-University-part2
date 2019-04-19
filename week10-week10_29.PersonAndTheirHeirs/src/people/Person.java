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
public class Person {
    private Map<String, String> person;
    
    public Person(String name , String address){
    
        person = new HashMap<String, String>();
        person.put(name, address);
    }
    
    @Override
    public String toString(){
    String names = "";
        for(String name : person.keySet()){
            names +=name;
        }
        return names + "\n" + "  " +person.get(names); 
    }
    
    
}
