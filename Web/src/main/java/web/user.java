/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author Gayanaka
 */
public class user {
    public int userId;
    public String username;
    public String email;
    public String mobileNo;
    public String address;
    
    public user(int userId,String username,String email,String mobileNo,String address){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
    }
}
