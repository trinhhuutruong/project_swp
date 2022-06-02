/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DBConnect;

/**
 *
 * @author Admin
 */
public class StaffDAO {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    private final String CREATE="INSERT INTO tblStaff (staffID,password,fullName,storeID) values (?, ?, ?, ?);";
    public boolean createStaff(String id, String password, String fullName, String storeID) throws SQLException {
        con=DBConnect.makeConnection();
        if(con!=null){
            stm=con.prepareStatement(CREATE);
            stm.setString(1, id);
            stm.setString(2, password);
            stm.setString(3, fullName);
            stm.setString(4, "");
            if(stm.executeUpdate()>0) return true;
        }
        if(stm!=null) stm.close();
        if(con!=null) con.close();
        return false;
    }
    
}
