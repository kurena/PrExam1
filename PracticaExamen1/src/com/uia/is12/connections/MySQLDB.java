
package com.uia.is12.connections;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDB {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/semana8";
    
    static final String USER = "root";
    static final String PASSWORD = "root";
    
    private Connection con = null;
    private CallableStatement cstmt = null;
    private Statement stmt = null;

    public MySQLDB() {
    }
    
    public ResultSet executeQuery(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        cstmt = con.prepareCall(sql);
        ResultSet res = cstmt.executeQuery();
        cstmt.close();
        con.close();
        
        return res;
        
    }
    
    public void execute(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        stmt = con.prepareCall(sql);
        stmt.execute(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.close();
        con.close();
    }
}
