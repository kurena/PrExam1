/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;

import com.uia.is12.domain.Poem;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Vera
 */
public class PoemDAO {
    
    public PoemDAO(){
    
    }
    
    public Poem getPoem(){
        Poem poem = new Poem();
        ArrayList<Verse> verses= new ArrayList();
        
        verses.add(new Verse("When I find my code in tons of trouble,",5000));
        verses.add(new Verse("Friends and colleagues come to me,",5000));
        verses.add(new Verse("Speaking words of wisdom:",5000));
        verses.add(new Verse("Write in C.",5000));
        verses.add(new Verse("Write in C, Write in C,",5000));
        verses.add(new Verse("Write in C, oh, Write in C.",5000));
        verses.add(new Verse("BASIC's not the answer.",5000));
        verses.add(new Verse("Write in C",5000));
        
        poem.setVerse(verses);
        return poem;
    }
    //Pueden crear un metodo main para probar que todo este funcionando
    public static void main(String args[]){
        //NOTA: instancia de tipo PoemDAO
        PoemDAO poemDAO = new PoemDAO();
        ArrayList<Verse> verses= poemDAO.getPoem().getVerse();
        
        for(Verse v: verses){
            System.out.println(v.getParagraph());
        }
        
    }
    
}
