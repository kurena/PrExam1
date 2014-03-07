/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.view;

import com.uia.is12.business.PoemBusiness;
import com.uia.is12.domain.Verse;
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
    
    public void run() {
            try {
                ArrayList<Verse> verses= poemBusiness.getPoem().getVerse();
                
                for(Verse v: verses){
                    Thread.sleep(v.getReadingTime());
                    System.out.println(v.getParagraph());
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(PoemView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
    
}
