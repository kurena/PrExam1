/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;

import com.uia.is12.domain.Poem;
import com.uia.is12.domain.Verse;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Vera
 */
public class PoemDAO {
    
    
    
    public PoemDAO(){
    
    }
    
    public Poem getPoem() throws SQLException{
        Poem poem = new Poem();
        ArrayList<Verse> verses= new ArrayList();
        
       
        poem.setVerse(verses);
        return poem;
        
        
    }
   
    
}
