/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author AdminDTO
 */
public class AdminDTO {
    private String adminID;
    private String fullName;
    private String password;
    
    public AdminDTO(){
        this.adminID = "";
        this.fullName = "";
        this.password = "";
    }

    public AdminDTO(String adminID, String fullName, String password) {
        this.adminID = adminID;
        this.fullName = fullName;
        this.password = password;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
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
    
    
}
