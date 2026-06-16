/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author adefr
 */
public class LatihanMap {
    public static void main(String[] args) {
        //1. Membuat objek Map untuk menyimpan NIM (Key) dan Nama (Value)
        Map<String, String> mapMahasiswa = new HashMap<>();
                
        //2. Menambahkan data mahasiswa
        mapMahasiswa.put("140100", "Andi Wijaya");
        mapMahasiswa.put("140111", "Budi Santoso");
        mapMahasiswa.put("140112", "Cici Kirana");
        mapMahasiswa.put("140113", "Dewa Lewanto");
        
        System.out.println("======= DAFTAR MAHASISWA =======");
        
        //3. Menampilkan key dan value menggunakan ekspresi lambda
        mapMahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
