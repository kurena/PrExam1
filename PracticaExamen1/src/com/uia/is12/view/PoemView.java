/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.view;

import com.uia.is12.business.PoemBusiness;
import com.uia.is12.domain.Verse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vera
 */
public class PoemView extends Thread{
    private PoemBusiness poemBusiness;

    public PoemView() {
        this.poemBusiness = new PoemBusiness();
    }
    
    public void run(){
            
            
         }
    
}
