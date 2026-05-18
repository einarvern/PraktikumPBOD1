/* Nama File  : Garis.java
 * Deskripsi  : Berisi atribut dan method dalam class Garis
 * Pembuat    : Adefritz Einar Sinaga/24060124140186
 * Tanggal    :2/03/2026
*/

public class Garis {
    // States / Atribut
    Titik T1;
    Titik T2;
    static int counterGaris = 0;

    // Behaviour / Method
    
    // mengembalikan nilai titik
    static int counterGaris(){
        return counterGaris;
    }

    // konstruktor garis tanpa parameter yang menginisialisasi titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        T1 = new Titik();
        T2 = new Titik(1,1);
        counterGaris++;
    }

    // konstruktor garis dengan parameter masukan titik awal dan titik akhir
    Garis(Titik T1, Titik T2){
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;

    }

    // selektor untuk setiap atribut dan mutator
    // mengembalikan nilai T1
    Titik getTitikAwal(){
        return T1;
    }
    
    // mengembalikan nilai T2
    Titik getTitikAkhir(){
        return T2;
    }

    // mengubah nilai T1
    void setTitikAwal(Titik T1){
        this.T1 = T1;
    }

    // mengubah nilai T2
    void setTitikAkhir(Titik T2){
        this.T2 = T2;
    }

    // selektor counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    // menghitung panjang garis
    double getPanjang(){
        return Math.sqrt(Math.pow(T2.getAbsis() - T1.getAbsis(), 2) + Math.pow(T2.getOrdinat() - T1.getOrdinat(), 2));
    }

    // menghitung gradien garis
    double getGradien(){
        return (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
    }

    // menembalikan titik tengah garis
    Titik getMidPoint(){
        double midX = (T1.getAbsis() + T2.getAbsis()) / 2;
        double midY = (T1.getOrdinat() + T2.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // predikat pengecekan garis sejajar
    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    // predikat pengecekan garis tegak lurus`
    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    // menampilkan ke layar  k awal dan  k akhir garis
    void printGaris(){
        System.out.println("Titik Awal: (" + T1.getAbsis() + ", " + T1.getOrdinat() + "), Titik Akhir (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }

    // menampilkan persamaan garus dalam bentuk string y = mx + c
    void printPersamaanGaris(){
        System.out.println("y = " + getGradien() + "x + " + (T1.getOrdinat() - getGradien() * T1.getAbsis()));
    }
}