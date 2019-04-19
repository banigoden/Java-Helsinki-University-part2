/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Deni
 */
public class Purchase {
     
    private String product;
    private int price;
    private int amount;
    
    public Purchase(String product, int amount, int unitPrice){
    
        this.product = product;
        this.amount = amount;
        this.price = unitPrice;
       
    }
   
    public String product(){
        return product;
    }
    
    public int price(){
      
        return price * amount;
    }
    
    public void increaseAmount(){
    
        amount++;
        
    }
    @Override
    public String toString(){
    
        return product +  ": " + amount;
    }
}
