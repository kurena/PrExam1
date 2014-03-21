
package com.uia.is12.data;

import com.uia.is12.domain.Prize;
import com.uia.is12.connections.MySQLDB;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrizeDAO {
    
    private MySQLDB mysqlDB;
    
    public void add(Prize prize) throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "INSERT INTO prize values("+prize.getId()+","+prize.getAmount()+",'"+prize.getName()+"',"+prize.getTickets_needed()+",'"+prize.getDescription()+"')";
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
    }
    
    public boolean exist(Prize prize) throws SQLException{
        boolean exist = false;
        mysqlDB = new MySQLDB();
        String sql = "SELECT * FROM prize WHERE prize_id="+prize.getId()+"";
        ResultSet res = mysqlDB.executeQuery(sql);
        if (res.next()) {
            exist=true;
        }        
        mysqlDB.closeExecuteQuery();
        return exist;
    }
    
    public void update(Prize prize) throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "UPDATE prize SET prize_amount="+prize.getAmount()+",prize_name='"+prize.getName()+"',prize_tickets_needed="+prize.getTickets_needed()+",prize_description='"+prize.getDescription()+"' WHERE prize_id="+prize.getId()+"";
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
    }
    
    public void delete(Prize prize) throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "DELETE FROM prize WHERE prize_id="+prize.getId()+"";
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
    }
    
}
