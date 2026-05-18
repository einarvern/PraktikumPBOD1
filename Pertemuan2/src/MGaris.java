/* Nama File  : MGaris.java
 * Deskripsi  : Main Program Objek Garis
 * Pembuat    : Adefritz Einar Sinaga/24060124140186
 * Tanggal    :2/03/2026
*/

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik T1 = new Titik(0, 0);
        Titik T2 = new Titik(6, 8);
        Titik T3 = new Titik(10, 20);
        Titik T4 = new Titik(5, 6);

        // Membuat objek Garis
        Garis g1 = new Garis(T1, T2); // Garis dari (0, 0) ke (6, 8)
        Garis g2 = new Garis(T3, T4); // Garis dari (10, 20) ke (5, 6)

        // Menggunakan semua fungsi dari kelas Garis
        System.out.println("=== Tentang Garis 1 ===");
        g1.printGaris();
        System.out.println("Panjang Garis 1: " + g1.getPanjang());
        System.out.println("Gradien Garis 1: " + g1.getGradien());
        System.out.println("Mid Point Garis 1: (" + g1.getMidPoint().getAbsis() + ", " + g1.getMidPoint().getOrdinat() + ")");
        g1.printPersamaanGaris();

        System.out.println("\n=== Tentang Garis 2 ===");
        g2.printGaris();
        System.out.println("Panjang Garis 2: " + g2.getPanjang());
        System.out.println("Gradien Garis 2: " + g2.getGradien());
        System.out.println("Mid Point Garis 2: (" + g2.getMidPoint().getAbsis() + ", " + g2.getMidPoint().getOrdinat() + ")");
        g2.printPersamaanGaris();

        // Mengecek hubungan antara garis 1 dan garis 2
        System.out.println("\n=== Relasi Garis 1 dan Garis 2 ===");
        System.out.println("Apakah garis 1 sejajar dengan garis 2? " + g1.isSejajar(g2));
        System.out.println("Apakah garis 1 tegak lurus dengan garis 2? " + g1.isTegakLurus(g2));

        // Menggunakan counterGaris
        System.out.println("\nTotal jumlah garis: " + Garis.getCounterGaris());
    }
}