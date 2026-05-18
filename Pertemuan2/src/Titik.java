/* Nama File  : Titik.java
 * Deskripsi  : Berisi atribut dan method dalam class Titik
 * Pembuat    : Adefritz Einar Sinaga/24060124140186
 * Tanggal    :24/02/2026
 */

public class Titik {
    /***************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD******************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (x,y)
    // Titik(double x, double y){
    //     absis = x;
    //     ordinat = y;
    //     counterTitik++;
    // }
     
    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis , double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

     public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //getKuadran
    int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    //getJarakPusat
    public double getJarakPusat() {
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    //getJarak
    public double getJarak(Titik T) {
        double selisihX = this.absis - T.getAbsis();
        double selisihY = this.ordinat - T.getOrdinat();

        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }

    //refleksiX
    public void refleksiX() {
        ordinat = ordinat * -1 ;
    }

    //refleksiY
    public void refleksiY() {
        absis = absis * -1 ;
    }

    //getRefleksiX
    public Titik getRefleksiX() {
        return new Titik(absis, ordinat * -1) ;
    }

    //getRefleksiY
    public Titik getRefleksiY() {
        return new Titik(absis * -1, ordinat) ;
    }


     //konstruktur untuk membuat titik (0,0)
    // Titik(){
    //     this(0,0) ;
    // }

    // // mengembalikan nilai counterTitik
    // static int getCounterTitik(){
    //     return counterTitik;
    // }
    
    // //mengembalikan nilai absis
    // double getAbsis(){
    //     return absis;
    // }

    // //mengembalikan nilai ordinat
    // double getOrdinat(){
    //     return ordinat;
    // }

    // //mengeset absis titik dengan nilai baru x
    // void setAbsis(double x){
    //     absis = x;
    // }

    // //mengeset ordinat titik dengan nilai baru y
    // void setOrdinat(double y){
    //     ordinat = y;
    // }

    // //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    // void geser(double x, double y){
    //     absis = absis + x;
    //     ordinat = ordinat + x;   // sesuai yang ada di gambar
    // }

    // //mencetak koordinat titik
    // void printTitik(){
    //     System.out.println("Titik (" + absis + ", " + ordinat + ")");
    // }

    //  void printCounterTitik(){
    //         System.out.println(this.counterTitik);
    //     }

    
    
}