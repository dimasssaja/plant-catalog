/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class SQLQuery {
    
    public static void getTxMenanam() {
        try {
            Connection conn = (Connection) Konfig.configDb();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tx_menanam");zx zxx
            
        } catch (Exception e) {
        }
        
    }
    
}
