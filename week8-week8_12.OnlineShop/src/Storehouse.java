
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
public class Storehouse {
    private Map<String, Integer> stores;
    private Map<String, Integer> stock;
    
    public Storehouse(){
        
        stores = new HashMap <String, Integer>();
        stock = new HashMap <String, Integer>();
    }
    public void addProduct(String product, int price, int stock){
    
        stores.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        
        
        for(String name : stores.keySet()){
        if(name.contains(product)){
                return stores.get(name);
           }
        }
        return -99;
    }
    
    public int stock(String product){
       int stocks = 0; 
    for(String name : stock.keySet()){
        if(name.contains(product)){
                stocks = stock.get(name);
        }
    }
    return stocks;
    }
    
    public boolean take(String product){
    
       for(String name : stock.keySet()){
        if(name.contains(product)){
            int stocks = stock.get(name).intValue();
            if(stocks > 0){
                stocks--;
                stock.replace(name, stocks);
                return true;
            }
        }    
    }   
       return false;
    }
    
    public Set<String> products(){
        
    Set<String> names = stores.keySet();
       
    return names;
    }
}
