
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deni
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
    
        owners = new HashMap<RegistrationPlate, String>();
        
    }
    
    public boolean add(RegistrationPlate plate, String owner){
    if(owners.get(plate) == null){
        owners.put(plate, owner);
    return true;
    }
    return false;
    }
    public String get(RegistrationPlate plate){
    
       if(owners.containsKey(plate))
           return owners.get(plate);
    return null;
    }
    public boolean delete(RegistrationPlate plate){
    if(owners.containsKey(plate)){
    owners.remove(plate);
    return true;
    }
    else return false;
    }
    
    public void printRegistrationPlates(){
    
       for(RegistrationPlate plate : owners.keySet()){
           System.out.println(plate);
           
       }
    }
    public void printOwners(){
    ArrayList<String> owner = new ArrayList<String>();
        for(RegistrationPlate plate : owners.keySet()){
            String own = owners.get(plate);
            if(!owner.contains(own)){
                owner.add(own);
            }
        }
   
    for(String printOwner : owner){

            System.out.println(printOwner);
        }
    }
    }
