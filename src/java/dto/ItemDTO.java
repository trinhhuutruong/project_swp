/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.File;
import java.sql.Date;

/**
 *
 * @author user
 */
public class ItemDTO {
    int itemID;
    String itemName;
    String itemPic;
    String customeID;
    String storeID;
    Date itemSendingDate;
    Date itemGettingDate;
   boolean status;

    public ItemDTO(int itemID, String itemName, String itemPic, String customeID, String storeID, Date itemSendingDate, Date itemGettingDate, boolean status) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPic = itemPic;
        this.customeID = customeID;
        this.storeID = storeID;
        this.itemSendingDate = itemSendingDate;
        this.itemGettingDate = itemGettingDate;
        this.status = status;
    }

    public ItemDTO() {
        this.itemID = 0;
        this.itemName = "";
        this.itemPic = null;
        this.customeID = "";
        this.storeID = "";
        this.itemSendingDate = null;
        this.itemGettingDate = null;
        this.status = false;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic;
    }

    public String getCustomeID() {
        return customeID;
    }

    public void setCustomeID(String customeID) {
        this.customeID = customeID;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public Date getItemSendingDate() {
        return itemSendingDate;
    }

    public void setItemSendingDate(Date itemSendingDate) {
        this.itemSendingDate = itemSendingDate;
    }

    public Date getItemGettingDate() {
        return itemGettingDate;
    }

    public void setItemGettingDate(Date itemGettingDate) {
        this.itemGettingDate = itemGettingDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
}
