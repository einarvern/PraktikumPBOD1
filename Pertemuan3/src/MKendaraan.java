/* Nama File : MKendaraan.java
 * Deskripsi : Main class untuk program Mahasiswa
 * Pembuat   : Adefritz Einar Sinaga/24060124140186
 * Tanggal   : 11 Maret 2026
 */

public class MKendaraan {
    public static void main(String[] args){
        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("BP123H");
        K1.setJenis("Mobil");

        System.out.println("No Plat kendaraan: " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan: " + K1.getJenis());
    }
}