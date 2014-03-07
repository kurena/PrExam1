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
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/semana8";
    
    static final String USER = "root";
    static final String PASSWORD = "root";
    
    Connection con = null;
    CallableStatement stmt = null;
    
    public PoemDAO(){
    
    }
    
    public Poem getPoem() throws SQLException{
        Poem poem = new Poem();
        ArrayList<Verse> verses= new ArrayList();
        
        con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        String sql = "SELECT * FROM verse";
        stmt = con.prepareCall(sql);
        ResultSet res = stmt.executeQuery();
        
        while (res.next()){
            System.out.println(res.getString("paragraph") + "\t" + res.getString("time"));
        }
        
        stmt.close();
        con.close();
        
        poem.setVerse(verses);
        return poem;
        
        
    }
   
    
}
