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
public class Key {
    private String comfirmKey;
    private boolean statusKey;
    private Admin adminID;

    public Key() {
    }

    public Key(String comfirmKey, boolean statusKey, Admin adminID) {
        this.comfirmKey = comfirmKey;
        this.statusKey = statusKey;
        this.adminID = adminID;
    }

    public String getComfirmKey() {
        return comfirmKey;
    }

    public void setComfirmKey(String comfirmKey) {
        this.comfirmKey = comfirmKey;
    }

    public boolean isStatusKey() {
        return statusKey;
    }

    public void setStatusKey(boolean statusKey) {
        this.statusKey = statusKey;
    }

    public Admin getAdminID() {
        return adminID;
    }

    public void setAdminID(Admin adminID) {
        this.adminID = adminID;
    }
    
    
}
