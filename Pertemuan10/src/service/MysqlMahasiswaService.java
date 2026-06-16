/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Mahasiswa;
import utilities.MyUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author adefr
 */
public class MysqlMahasiswaService {
private Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MyUtility.getConnection();
    }

    // Method Create
    public void tambahMahasiswa(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Mahasiswa " + mhs.getNama() + " berhasil ditambahkan.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}