
package com.uia.is12.data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Administrador
 */
public class prizesDAOTest {
    
    private final String DB_URL = "jdbc:mysql://localhost:3306/examen2";
    private final String USER = "root";
    private final String PASS = "root";
    private Connection con;
    private CallableStatement cStmt;
    private Statement stmt;
    public prizesDAOTest() {
    }
    
    
    @Before
    public void setUp() {
        System.out.println("....Test is starting");
        con = null;
        cStmt = null;
        stmt = null;
    }
    
    @Test
    public void exist() throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        String sql = "SELECT * FROM prize WHERE prize_id= 1";
        cStmt = con.prepareCall(sql);
        ResultSet res = cStmt.executeQuery(); 
        
        while (res.next()) {
            System.out.println(res.getString("prize_name")+" ---- "+res.getString("prize_amount")+"----"+res.getString("prize_tickets_needed")+"----"+res.getString("prize_description"));
          }
        System.out.println("....select method test is done");
        cStmt.close();
        con.close();
    }
    
    @Test
    @Ignore
    public void add() throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        String sql = "INSERT INTO prize values(2,15,'test2',89,'just the second test')";
        stmt = con.createStatement();
        stmt.execute(sql); 
        System.out.println("....insert method test is done");
        stmt.close();
        con.close();
    }
    
    @Test
    @Ignore
    public void update() throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        String sql = "UPDATE prize SET prize_name='test done' WHERE prize_id=1";
        stmt = con.createStatement();
        stmt.execute(sql); 
        System.out.println("....update method test is done");
        stmt.close();
        con.close();
    }
    
    @Test
    public void delete() throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        String sql = "DELETE FROM prize WHERE prize_id=1";
        stmt = con.createStatement();
        stmt.execute(sql); 
        System.out.println("....delete method test is done");
        stmt.close();
        con.close();
    }
    
    @After
    public void tearDown() {
        System.out.println("....Test is done");
    }
    
}
