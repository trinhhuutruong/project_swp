/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author user
 */
public class BillDTO {
    int billID;
    int itemID;
    int pawnMoney;
    int numberDays;
    float interestRate;
    Date billBeginDate;
    String staffID;

    public BillDTO(int billID, int itemID, int pawnMoney, int numberDays, float interestRate, Date billBeginDate, String staffID) {
        this.billID = billID;
        this.itemID = itemID;
        this.pawnMoney = pawnMoney;
        this.numberDays = numberDays;
        this.interestRate = interestRate;
        this.billBeginDate = billBeginDate;
        this.staffID = staffID;
    }

    public BillDTO() {
        this.billID = 0;
        this.itemID = 0;
        this.pawnMoney = 0;
        this.numberDays = 0;
        this.interestRate = 0;
        this.billBeginDate = null;
        this.staffID = "";
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getPawnMoney() {
        return pawnMoney;
    }

    public void setPawnMoney(int pawnMoney) {
        this.pawnMoney = pawnMoney;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Date getBillBeginDate() {
        return billBeginDate;
    }

    public void setBillBeginDate(Date billBeginDate) {
        this.billBeginDate = billBeginDate;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
    
    
}
