/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Deni
 */
public class ProductContainer extends Container{

    private String name;
    
    public ProductContainer(String productName, double capacity){
    
        super(capacity);
        name = productName;
    
    }
    
    public void setName(String newName){
    
        name = newName;
    }
    
    public String getName(){
    
        return name;
    }
  
    
    
    
    @Override
    public String toString(){  
        return  name + ": " + super.toString() ;
    }
}
