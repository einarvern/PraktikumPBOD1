/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author adefr
 */
public class MainDAO {
    public static void main(String[] args) {
        DAOManager daoManager = new DAOManager();
        PersonDAO personDAO = new MySQLPersonDAO(daoManager);
        
        //masukkan data baru
        Person p1 = new Person(0, "Budi Santoso");
        personDAO.insertPerson(p1);
    }
}
