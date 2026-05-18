 /* Nama File : MTitik.java
 * Deskripsi : Main program objek Titik
 * Pembuat   : Adefritz Einar Sinaga/24060124140186
 * Tanggal   :24/02/2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(0, 0); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        // Object Reference
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(20);
        T2.printTitik();

        // Overloading Constructor
        Titik T3 = new Titik(5, 6);
        T3.printTitik();

        // Static Attribute & Method
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik());

    }


    
}