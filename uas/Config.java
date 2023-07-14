/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Config {
    
    public static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try {
            String DB_URL = "jdbc:mysql://127.0.0.1:3306/uas_pbo";
            String USER = "root";
            String PASS = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(DB_URL, USER, PASS);
                    
        }
        catch (Exception e){
            System.err.println("Koneksi Gagal " + e.getMessage());
        }
        return mysqlconfig;
    }
    
    
    
}
