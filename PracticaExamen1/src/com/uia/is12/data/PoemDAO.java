/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;

import com.uia.is12.domain.Poem;
import com.uia.is12.domain.Verse;
import com.uia.is12.connections.MySQLDB;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Vera
 */
public class PoemDAO {
    
    private MySQLDB mysqlDB;
    
    
    public PoemDAO(){
        
    }
    
    public void add(Poem poem) throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "insert into poem(id,name)"+
                "values ("+poem.getId()+","+poem.getName()+")";
        mysqlDB.execute(sql);
        mysqlDB.close();
    }
    
    public boolean exists(Poem poem) throws SQLException{
        boolean exist = false;
        mysqlDB = new MySQLDB();
        
        String sql = "SELECT * FROM poem WHERE name='"+poem.getName()+"'";
        ResultSet res = mysqlDB.executeQuery(sql);
        if(res.next()){
            exist = true;
        }
        mysqlDB.close();
        return exist;
    }
    
   
    
}
