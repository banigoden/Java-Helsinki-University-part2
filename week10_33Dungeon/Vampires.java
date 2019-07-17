/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;


import java.util.List;
import java.util.Random;

/**
 *
 * @author ekaterinashvidchenko
 */
public class Vampires  implements User{
    
   
    private int length;
    private int height;
    private int x;
    private int y;
    private Random random;
    private List <Vampires> vampires;
    
    
    
    public Vampires(int length, int height){
        
        this.length = length;
        this.height = height;
        random = new Random();
        x = random.nextInt(length - 0);
        y = random.nextInt(height - 0);
        
    }
    
    public int getX(){
    
        return x;
    }
    public int getY(){
    
        return y;
    }

    public void setVampires(List<Vampires> vampires) {
         this.vampires = vampires;
    }
    @Override
    public void move() { 
        int l = 1 + (int) (Math.random() * 2);
        int h = 1 + (int) (Math.random() * 2);
        if(l == 1){
            y--;
            if(y < 0){
                y = y + 2;
            }
            //checkPosition(x,y);
        }else if(h == 1){    
            x++;
            if(x >= height){
               x = x - 2; 
            }          
        }else if (l == 2){
            y++;
            if(y >= length){
                y = y - 2;   
            }
        }else if(h == 2){
            x--;
            if(x < 0){
                x = x + 2;
                }
            }
    }
    
    
     public void checkPosition(int x, int y){    
        for(Vampires v : vampires){
            if(v.getX() == x && v.getY() == y){
                this.move();
            }
        }
    }
    
    @Override
    public String toString(){
        return  "v " + x + " " + y;
    }

    public boolean haveSamePosition(Vampires newVampire) {
        if(newVampire.getX() == getX() || newVampire.getY() == getY()){
            return true;
        }else
            return false;
    }

    
    
}
