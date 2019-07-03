/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Deni
 */
public class Person {
    
    private Education edu;
    private String name;
    
    public Person(String name, Education edu){
        this.name = name;
        this.edu = edu;
    
    }
    
    @Override
    public String toString(){
    
    return name + ", " + edu;
    }
    public Education getEducation() {
        return edu;
    }

    public String getName() {
        return name;
    }
    
}
