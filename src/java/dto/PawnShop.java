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
public class PawnShop {
    private String storeID;
    private String storeName;
    private String storeAddress;
    private int phoneNumber;
    private String managerID;
    private Key comfirmKey;

    public PawnShop() {
    }

    public PawnShop(String storeID, String storeName, String storeAddress, int phoneNumber, String managerID, Key comfirmKey) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.phoneNumber = phoneNumber;
        this.managerID = managerID;
        this.comfirmKey = comfirmKey;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public Key getComfirmKey() {
        return comfirmKey;
    }

    public void setComfirmKey(Key comfirmKey) {
        this.comfirmKey = comfirmKey;
    }
    
    
}
