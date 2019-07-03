/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deni
 */
public class MindfulDictionary {
    
    private HashMap <String, String> words;
    private File file;
    
     public MindfulDictionary(){
        words = new HashMap<String, String>();    
     }
     
     public MindfulDictionary(String file) {
        this();
       this.file = new File(file);
        
    }
    
    public void add(String word, String translation){
        
       if(!words.containsKey(word)){
          words.put(word, translation);
          words.put(translation, word);
       }
    }
    
   
    
    public boolean load(){
       
        try {
            Scanner fileReader = new Scanner(file);
             while ( fileReader.hasNextLine() ){
            String line = fileReader.nextLine();
            String[] parts = line.split(":");   // the line is split at :
            words.put(parts[0], parts[1]);
            words.put(parts[1], parts[0]);
//            System.out.println( parts[0] );     // the part of the line before :
//            System.out.println( parts[1] );     // the part of the line after :
        }
        } catch (FileNotFoundException ex) {
           return false;
        }
       
        return true;
    }
    public String translate(String word){    
        return words.get(word);
    }
    
    public String translation(String word){
        return words.get(word);
    }
    
    public void remove(String word){
        String translation = translation(word);
        words.remove(translation);
        words.remove(word);
    }
    
    public boolean save(){
        
        FileWriter fileWrite;
        try {
            fileWrite = new FileWriter(file);
            write(fileWrite);
            fileWrite.close();
        } catch (IOException ex){
            return false;
        }
        return true;
    }
    
    public void write(FileWriter fileWriter) throws IOException{
    
        ArrayList<String> alreadyCont = new ArrayList<String>();
        
        for(String word : words.keySet()){
            String translation = words.get(word);
            
        if(!alreadyCont.contains(word)){
            String pair = word + ":" + words.get(word);
            fileWriter.write(pair + "\n");
            alreadyCont.add(translation);
            
        }
        }
    }
}
