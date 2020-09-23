/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gayanaka
 */
public class UserDAOImpl {
    UserDAOImpl dao = new UserDAOImpl();
        // dao.addUser(new User(0, "admin", "12345", "admin", "1"));
//		System.out.println(dao.checkUser("admin"));
//        System.out.println(dao.login("admin", "12345"));
    
    public boolean login(String Email, String Password) {
        
        Connection con = dbconnect.openconnection();
    String sql = "select * from user where email='" + Email
            + "' and pasword='" + Password + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                con.close();
                return true;
            }
        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    }





