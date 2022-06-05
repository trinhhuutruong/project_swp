/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Admin
 */
public class StaffDTO {
    private String staffID;
    private String fullName;
    private String password;
    private String storeID;
    
    public StaffDTO(){
         this.staffID = "";
        this.fullName = "";
        this.password = "";
        this.storeID = "";
    }

    public StaffDTO(String staffID, String fullName, String password, String storeID) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.password = password;
        this.storeID = storeID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }


    
}
