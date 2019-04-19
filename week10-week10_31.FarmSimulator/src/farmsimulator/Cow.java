/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Deni
 */
public class Cow implements Milkable, Alive{
    
     private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

        private String name;
        private double udder;
        private double milkAmount;
    
    public Cow(){
        
         this(NAMES[new Random().nextInt(NAMES.length - 1)]);
        
       
    }
    public Cow(String name){
     this.name = name;
      milkAmount = 0;
      udder = 15 + new Random().nextInt(26);
    }
    
    public String getName(){
    
        return name;
    }
    public double getCapacity(){
       
        return udder;
    }
    public double getAmount(){
    
        return milkAmount;
    }
    
    @Override
    public String toString(){
     return name +" " + Math.ceil(milkAmount) + "/" + Math.ceil(udder);
    }

    @Override
    public double milk() {
       double milked = milkAmount;
        milkAmount = 0;
        
        return milked;
    }

    @Override
    public void liveHour() {
         double amount = new Random().nextDouble() * 1.3 + 0.7;
          
        if (milkAmount + amount > udder) {
            milkAmount = udder;
        } else {
            milkAmount += amount;
        }
    }
    
}
