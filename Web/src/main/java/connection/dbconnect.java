/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Gayanaka
 */
public class dbconnect {
    private static final String URL = "jdbc:mysql://localhost:3306/hotdevil?useSSL=false";

    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "gayanaka";

    private static Connection connection = null;

    //define static method
    public static Connection openconnection() {

        //check the connection
        if (connection != null) {
            return connection;
        } else {

            try {
                //load the driver
                Class.forName(DRIVER);

                //Get the connection
                 connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 
                 
                
            } catch (ClassNotFoundException | SQLException e) {
            }

            //Return the connection
            return connection;

        }
    }
}