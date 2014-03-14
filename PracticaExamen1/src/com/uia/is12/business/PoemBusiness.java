/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.PoemDAO;
import com.uia.is12.domain.Poem;
import com.uia.is12.domain.Verse;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Vera
 */
public class PoemBusiness {

    private PoemDAO poemDAO;
    
    public PoemBusiness() {
    
        this.poemDAO = new PoemDAO();
    }
    public void add(Poem poem) throws SQLException, Exception{
        if(!(poemDAO.exists(poem))){
           poemDAO.add(poem); 
        }else{
            throw new Exception("El poema ya existe en la BD");
        }
    }
}
