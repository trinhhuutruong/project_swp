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
public class Staff {
    private String staffID;
    private String fullName;
    private String password;
    private PawnShop storeID;
    
    public Staff(){
        
    }

    public Staff(String staffID, String fullName, String password, PawnShop storeID) {
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

    public PawnShop getStoreID() {
        return storeID;
    }

    public void setStoreID(PawnShop storeID) {
        this.storeID = storeID;
    }

    
    
}
