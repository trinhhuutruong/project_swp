/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.CustomerDTO;
import dto.ItemDTO;
import java.sql.Connection;
import java.sql.Date;
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
public class ItemDAO {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    private final String VIEW = "SELECT * FROM tblStaff WHERE staffID = ?";
    private final String CREATE = "INSERT INTO tblStaff (staffID,password,fullName,storeID) values (?, ?, ?, ?);";
    private final String UPDATE = "UPDATE tblStaff set password = ?, fullName = ? , storeID = ? WHERE staffID = ? ;";
    private final String DELETE = "DELETE FROM tblStaff WHERE staffID = ? ";

    public List<ItemDTO> viewItem() throws SQLException, ClassNotFoundException {
        List<ItemDTO> itemList = null;
        try {
            con = DBConnect.makeConnection();
            if (con != null) {
                stm = con.prepareStatement("Select * from tblItem");
                rs = stm.executeQuery();
                while (rs.next()) {
                    if (itemList== null){
                        itemList = new ArrayList<>();
                    }
                    int itemID = rs.getInt("itemID");
                    String itemName = rs.getString("itemName");
                    String itemPic = rs.getString("itemPic");
                    String customerID = rs.getString("customerID");
                    String storeID = rs.getString("storeID");
                    Date itemSendingDate = rs.getDate("itemSendingDate");
                    Date itemGettingDate = rs.getDate("itemGettingDate");
                    boolean statusID = rs.getBoolean("statusID");
                    itemList.add(new ItemDTO(itemID, itemName, itemPic, customerID, storeID, itemSendingDate, itemGettingDate, statusID));
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
        return itemList;
    }
}
