/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author adefr
 */
public class MahasiswaService {
    private Connection konek;

    public MahasiswaService() {
        konek = Koneksi.getConnection();
    }

    public void insert(Mahasiswa mhs) {
        try {
            String sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
            PreparedStatement ps = konek.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stat = konek.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
                );
                listMhs.add(m);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listMhs;
    }

    public void update(int id, String nama) {
        try {
            String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";
            PreparedStatement ps = konek.prepareStatement(sql);
            ps.setString(1, nama);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = konek.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
