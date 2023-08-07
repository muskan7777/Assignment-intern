/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;



public class MyConnection {
    
    
    public static Connection getConnection()
    {
        
        Connection con = null;
        try{
            //class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/loginandregister","root","1234apple");
            
            
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
