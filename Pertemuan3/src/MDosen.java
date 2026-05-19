/* Nama File : MDosen.java
 * Deskripsi : Main class untuk program Dosen
 * Pembuat   : Adefritz Einar Sinaga/24060124140186
 * Tanggal   : 11 Maret 2026
 */

public class MDosen {
    public static void main(String[] args){
        Dosen D1 = new Dosen();
        D1.setNip("145777");
        D1.setNama("Fritz");
        D1.setProdi("Informatika");

        System.out.println("NIP: " + D1.getNip());
        System.out.println("Nama: " + D1.getNama());
        System.out.println(("Prodi: " + D1.getProdi()));
    }

}