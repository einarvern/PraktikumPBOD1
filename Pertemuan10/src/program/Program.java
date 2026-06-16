/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;
import model.Mahasiswa;
import service.MysqlMahasiswaService;
/**
 *
 * @author adefr
 */
public class Program {
public static void main(String[] args) {
        MysqlMahasiswaService service = new MysqlMahasiswaService();
        
        // Simulasi Create
        Mahasiswa mhs1 = new Mahasiswa(12345, "Siti Aminah");
        service.tambahMahasiswa(mhs1);
    }
}
