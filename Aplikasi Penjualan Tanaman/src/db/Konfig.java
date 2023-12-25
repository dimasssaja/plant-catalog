/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class Konfig {
    
    private static Connection MySqlConfig;
    public static Connection configDb() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/garden";
            String user = "root";
            String pass = "";
            
            MySqlConfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Sudah terhubung ke database");
        } catch (SQLException e) {
            System.out.println("koneksi ke database gagal: " + e.getMessage());
        }
        
        return MySqlConfig;
    }
    
}
