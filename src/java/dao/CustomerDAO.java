/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.CustomerDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DBConnect;

/**
 *
 * @author User
 */
public class CustomerDAO {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    private final String VIEW = "SELECT * FROM tblStaff WHERE staffID = ?";
    private final String CREATE = "INSERT INTO tblStaff (staffID,password,fullName,storeID) values (?, ?, ?, ?);";
    private final String UPDATE = "UPDATE tblStaff set password = ?, fullName = ? , storeID = ? WHERE staffID = ? ;";
    private final String DELETE = "DELETE FROM tblStaff WHERE staffID = ? ";

    public List<CustomerDTO> viewCustomer() throws SQLException, ClassNotFoundException {
        List<CustomerDTO> cusList = null;
        try {
            con = DBConnect.makeConnection();
            if (con != null) {
                stm = con.prepareStatement("Select * from tblCustomer");
                rs = stm.executeQuery();
                while (rs.next()) {
                    if (cusList== null){
                        cusList = new ArrayList<>();
                    }
                    String customerID = rs.getString("customerID");
                    String fullName = rs.getString("fullname");
                    int phoneNumber = rs.getInt("phoneNumber");
                    String address = rs.getString("address");
                    cusList.add(new CustomerDTO(customerID, fullName, phoneNumber, address)) ;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return cusList;
    }
}
