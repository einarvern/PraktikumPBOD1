/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author adefr
 */
public class MySQLPersonDAO implements PersonDAO{
    private DAOManager daoManager;
    
    public MySQLPersonDAO(DAOManager daoManager) {
        this.daoManager = daoManager;
    }
    
    @Override
    public void insertPerson(Person person) {
        try {
            Connection con = daoManager.getConnection();
            String query = "INSERT INTO person (name) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, person.getName());
            ps.executeUpdate();
            System.out.println("Berhasil menambahkan: " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
