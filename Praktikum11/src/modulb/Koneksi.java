/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author adefr
 */
public class Koneksi {
    private static Connection con;
    
    public static Connection getConnection() {
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_kampus";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi beahasil");
            } catch (SQLException ex) {
                System.out.println("Koneksi gagl: " + ex.getMessage());
            }
        }
        return con;
    }
}
