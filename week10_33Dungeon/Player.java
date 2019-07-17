/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author ekaterinashvidchenko
 */
public class Player implements User {

 
    private Scanner reader;
    
    private int x;
    private int y;
    private int length;
    private int height;
    
    
    public Player(Scanner reader, int length, int height){
       this.reader = reader;
       this.length = length;
       this.height = height;
       

    }
    
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    @Override
    public void move(){
    
        String move = reader.next();
        for (int i = 0; i < move.length(); i++) {
           char s = move.charAt(i);
        if(s == 'a'){
            y--;
            if(y < 0){                
                    y++;    
                }            
        }else if(s =='s'){    
            x++;
            if(x >= height){
                x--;
            }            
        }else if (s == 'd'){
            y++;
            if(y >= length){
                y--;               
            }            
        }else if(s == 'w'){
            x--;
            if(x < 0){          
                    x++;    
                }
            }
        } 
    }
     
    public boolean haveSamePositions(Vampires newVampire) {
        if(newVampire.getX() == getX() && newVampire.getY() == getY()){
            return true;       
        }else
            return false;
    }
    
    @Override
    public String toString(){
        return "@ " + y +  " " + x;
    }

//    public void setStart(int i, int i0) {
//        x = 0;
//        y= 0;
//    }

    
    
}
    