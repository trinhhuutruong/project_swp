/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBConnect {

    public static Connection makeConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "jbdc:sqlserver://localhost:1433;databaseName=Q_ANT";
            Connection con = DriverManager.getConnection(sql, "sa", "123456");
            return con;
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
            return null;
        }
    }
