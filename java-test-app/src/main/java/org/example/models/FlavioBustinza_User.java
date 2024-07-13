/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.models;

/**
 *
 * @author Acer
 */
public class FlavioBustinza_User {

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String encryptPassword(String password){
        String passwordEncrypted="";
        for(int x=0;x<password.length();x++){
            passwordEncrypted+="*";
        }
        return passwordEncrypted;
    }
    
}
