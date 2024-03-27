/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hoang Quan
 */
public class DBContext {
    
    public Connection getConnection()throws Exception {
        String url = "jdbc:postgresql://" + serverName + ":" + portNumber + "\\" 
                + instance + "/" + dbName;
        if(instance == null || instance.trim().isEmpty()){
            url = "jdbc:postgresql://" + serverName + ":" + portNumber + "/" + dbName;
        }
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, userID, password);
    }
   
    private final String serverName = "localhost";
    private final String dbName = "ManagerEmployee";
    private final String portNumber = "5432";
    private final String instance = "";
    private final String userID = "postgres";
    private final String password = "123456";
}
