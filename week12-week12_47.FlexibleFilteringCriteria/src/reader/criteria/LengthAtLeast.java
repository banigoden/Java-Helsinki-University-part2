/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Deni
 */
public class LengthAtLeast implements Criterion{

    private int lengthOfLine ;
    public LengthAtLeast(int length) {
    
        lengthOfLine = length;
    
    }

    @Override
    public boolean complies(String line) {
        
        return line.length() >= lengthOfLine;
    }
    
}
