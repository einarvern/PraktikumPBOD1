/* Nama File : MMahasiswa.java
 * Deskripsi : Main untuk program Mahasiswa
 * Pembuat   : Adefritz Einar Sinaga/24060124140186
 * Tanggal   : 11 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Mengubah data dummy Mata Kuliah beserta SKS-nya
        Matakuliah PBO = new Matakuliah("PAIK6401", "Pemrograman Berorientasi Objek", 3);
        Matakuliah ASA = new Matakuliah("PAIK6403", "Analisis dan Strategi Algoritma", 3);
        
        // Mengubah data dummy Mahasiswa, Dosen Wali, dan Kendaraan
        Mahasiswa M1 = new Mahasiswa("24060124140186", "Adefrit Einar", "Informatika");
        Dosen D1 = new Dosen("1985031201", "Dr. Budi Santoso", "Informatika");
        Kendaraan K1 = new Kendaraan("H 2414 EAS", "motor");

        // Menghubungkan relasi antar objek yang baru
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(ASA);

        // Menampilkan output hasil perubahan data
        M1.printDetailMhs();
        System.out.println("\n");
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}