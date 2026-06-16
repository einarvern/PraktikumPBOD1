/* Nama : Adefritz Einar Sinaga
 * NIM : 24060124140186
 * File : Teman.java
 * Tanggal : 20 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Udin");
        t.addNama("Fritz");
        t.addNama("Grace");

        t.showTeman();

        System.out.println("Jumlah Udin: " + t.countNama("Udin"));

        t.gantiNama("Fritz", "Einar");
        t.showTeman();
    }
}