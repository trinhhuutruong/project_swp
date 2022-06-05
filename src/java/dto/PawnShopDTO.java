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
public class PawnShopDTO {
    private String storeID;
    private String storeName;
    private String storeAddress;
    private int phoneNumber;
    private String managerID;
    private String confirmKey;

    public PawnShopDTO() {
        this.storeID = "";
        this.storeName = "";
        this.storeAddress = "";
        this.phoneNumber = 0;
        this.managerID = "";
        this.confirmKey = "";
    }

    public PawnShopDTO(String storeID, String storeName, String storeAddress, int phoneNumber, String managerID, String comfirmKey) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.phoneNumber = phoneNumber;
        this.managerID = managerID;
        this.confirmKey = comfirmKey;
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

    public String getConfirmKey() {
        return confirmKey;
    }

    public void setConfirmKey(String confirmKey) {
        this.confirmKey = confirmKey;
    }

    
}
