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
public class ShoppingBasket {
    
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
    
        basket = new HashMap<String, Purchase>();
        
    }
    
    public void add(String product, int price){

        if(basket.containsKey(product)){

            basket.get(product).increaseAmount();
           
        } else{
        Purchase purchase= new Purchase(product, 1, price);
        basket.put(product, purchase);
        }
        
        
    }
    public int price(){
    int sum = 0;
        for(Purchase purchase : basket.values()){
        
            sum += purchase.price();
        }
        return sum;
    }
    
    public void print(){
    
        for(Purchase purchase : basket.values()){
        
            System.out.println(purchase.toString()); 
        }
    }
    
}
