/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginregisterform;
import java.sql.*;
/**
 *
 * @author HP
 */
public class JdbcConnection {
    //ah, we need to set the connector first 
 
static final String DB_URL = "jdbc:mysql://localhost/demo";
static final String USER = "root"; 
 static final String PASS = "";
public static Connection connectjdbc(){
    
     Connection conn = null;
    try{
        // register jdbc driver,not required for never newer versions of jdk
      // Class.forName("com.mysql.jdbc.Driver");  
        // open a connection
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
        
    }catch(Exception ex){
        
        System.out.println("There were errors while connecting to db. ");
        return null;
    }
}  
}
