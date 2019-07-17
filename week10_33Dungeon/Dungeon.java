 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ekaterinashvidchenko
 */
public class Dungeon {
    
    private int length;
    private int height;
    private int moves;
    private List <Vampires> vampiress; 
    private Scanner reader;
    private Player player;
    private Map map;
    private int vampires;
    private boolean vampiresMove;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;
        this.moves = moves;
        this.vampires = vampires;
        vampiress  = new ArrayList<Vampires>();   
        reader = new Scanner(System.in);
        this.vampiresMove = vampiresMove;   
    }
    
    public void run(){

        create("player");
        for (int i = 0; vampiress.size() < vampires; i++) {
            create("vampir");  
        }
        //Map map = new Map(length, height, player, vampiress);
        //this.map = map;
        play();      
    }
    
    public void menuOfGame(){
    
        System.out.println(moves);
        System.out.println();
        System.out.println(player.toString());
        for(Vampires v : vampiress){  
            System.out.println(v.toString());
        }
        //map.map();
        map();
        System.out.println();    
    }
    
    public void play(){
      menuOfGame();
      while (true){  
          player.move();
          if(vampiresMove){
            for(Vampires vamp : vampiress){
                vamp.move();
            }
          }
          moves--;
          menuOfGame();
          playerKillVampire();
          if(moves == 0){
             System.out.println("YOU LOSE");
              break;
          }else if(vampiress.isEmpty()){
               System.out.println("YOU WIN");
              break;
          }         
        }    
    }
     
    public void create(String typeOfUser){
    
        if(typeOfUser == "player"){        
             player = new Player(reader, length, height);
        
        }else if((typeOfUser == "vampir")){
             Vampires newVampire = new Vampires(length, height);
             boolean place = true; 
             for(Vampires vamp : vampiress){
                if(vamp.haveSamePosition(newVampire)){
                    place = false;
                } 
                 
             }
             if(player.haveSamePositions(newVampire)){
                place = false;
             }
             if(place == true){
             
                 vampiress.add(newVampire);
             }
        }       
    }  
    
    public void map(){ // do not get data when call method map()
    
        
        System.out.println(); 
        for (int i = 0; i < height; i++) {
            
            for (int j = 0; j < length; j++) {
                
                if((i == player.getX()) && (j == player.getY()) ){
                    System.out.print("@");
                }
                else if(getPositionOfVampire(i,j)){
                    System.out.print("v");
                }else{
                    System.out.print(".");   
                }
            }
            System.out.println();  
        }
        
    }
    public boolean getPositionOfVampire( int x, int y){
        for(Vampires vamp : vampiress){
            if(vamp.getX()== x && vamp.getY() == y){
                return true;
            }   
        }
        return false;
    }
    public void playerKillVampire() {
        for (int j = 0; j < this.vampiress.size(); j++) {
            if (this.player.getX() == vampiress.get(j).getX() && this.player.getY() == vampiress.get(j).getY()) {
                this.vampiress.remove(j);
            }
        }
    }
}
