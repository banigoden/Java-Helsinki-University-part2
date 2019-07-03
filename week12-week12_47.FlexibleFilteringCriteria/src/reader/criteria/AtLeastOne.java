/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;


import java.util.*;

/**
 *
 * @author Deni
 */

public class AtLeastOne implements Criterion {

    private ArrayList<Criterion> criterion;
    private boolean bool = true;
    
    public AtLeastOne(Criterion... criteria) {
    
        criterion = new ArrayList<Criterion>();
        criterion.addAll(Arrays.asList(criteria));
       
    }

    @Override
    public boolean complies(String line) {
    
        for(Criterion v : criterion){
        
            if(v.complies(line)){
                return bool;
            }
        }
        return false;
    }
    
}
