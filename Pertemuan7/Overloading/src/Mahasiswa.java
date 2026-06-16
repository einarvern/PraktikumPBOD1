public class Mahasiswa {
    // Atribut
    private String NIM;
    private String Nama;
    private String prodi;

    // c . Konstruktor tanpa parameter dengan default
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.prodi = "n/a";
    }

    // d. Konstruktor dengan 3 parameter
    public Mahasiswa(String NIM, String Nama, String prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.prodi = prodi;
    }

    // e. Konstruktor dengan 1 parameter objek Mahasiswa lain
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.prodi = m.prodi;
    }

     public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProgramStudi() {
        return prodi;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProgramStudi() {
        this.prodi = "Kosong";
    }


    public void setProgramStudi(String prodi) {
        this.prodi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.prodi = m.getProgramStudi(); 
    }

    public void PrintInfo() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + prodi);
        System.out.println();
    }

}