/* Nama File : Matakuliah.java
 * Deskripsi : Berisi atribut dan method dalam class Matakuliah
 * Pembuat   : Adefritz Einar Sinaga/24060124140186
 * Tanggal   : 11 Maret 2026
 */

public class Matakuliah {
    /*****ATRIBUT*****/
    private String idMatKul;
    private String nama;
    private int sks;

    /*****METHOD*****/
    //konstuktor tanpa parameter
    public Matakuliah(){
        this.idMatKul = "";
        this.nama =  "";
        this.sks = 0;
    }

    //konstruktor dengan parameter
    public Matakuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama =  nama;
        this.sks = sks;
    }

    //Selektor
    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    //Mutator
    public void set_idMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

}