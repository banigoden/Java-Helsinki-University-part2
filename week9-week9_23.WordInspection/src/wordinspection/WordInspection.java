package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    
    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(file, "UTF-8");
        int nWords = 0;
        
        while (reader.hasNext()) {
            reader.next();
            nWords++;
        }
        
        return nWords;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> zWords = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.contains("z")) {
                zWords.add(word);
            }
        }
        
        return zWords;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.endsWith("l")) {
                words.add(word);
            }
        }
        
        return words;
    }
    
    public List<String> palindromes() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            int front = 0;
            int back = word.length() - 1;
            boolean isPalindrome = true;
            
            while (front < back) {
                if (word.charAt(front) != word.charAt(back)) {
                    isPalindrome = false;
                    break;
                }
                front++;
                back--;
            }
            
            if (isPalindrome) {
                words.add(word);
            }
        }
        
        return words;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        char[] vowels = "aeiouyäö".toCharArray();
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            boolean containsAllVowels = true;
            
            for (char vowel : vowels) {
                if (!word.contains("" + vowel)) {
                    containsAllVowels = false;
                    break;
                }
            }
            
            if (containsAllVowels) {
                words.add(word);
            }
        }
        
        return words;
    }
}
