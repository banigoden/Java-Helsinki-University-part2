/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Deni
 */
public class Employees {
    private List<Person> employee;
    
    
    public Employees(){
    
    employee = new ArrayList<Person>(); 
            }
    
    public void add(Person person){
    
        employee.add(person);
    } //adds the parameter person to the employees
    
    public void add(List<Person> persons){
       employee.addAll(persons);
    }// adds the parameter list of people to the employees
    
    public void print() {
        Iterator<Person> iterator = employee.iterator();
        while(iterator.hasNext()){
        
            System.out.println(iterator.next());
        }
    
    }//prints all the employees
    
    public void print(Education education){
        
         Iterator<Person> iterator = employee.iterator();
        
        while(iterator.hasNext()){
            Person nextP = iterator.next();
            if(nextP.getEducation() == education){
                 System.out.println(nextP);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = employee.iterator();
        
        while(iterator.hasNext()){
            Person nextP = iterator.next();
            if(nextP.getEducation() == education){
                 iterator.remove();
            }
        }
    }
    
}
