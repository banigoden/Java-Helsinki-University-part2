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
public class Student extends Person {

    private int count;
   
    public Student(String name, String address) {
        super(name, address);
      
        count = 0;
    }
    
    @Override
    public String toString(){

        return super.toString() + "\n" + "  credits " + credits();
    }
    
    public void study(){
     count++;
    }
    
    public int credits(){
    
        return count;
    }
}
