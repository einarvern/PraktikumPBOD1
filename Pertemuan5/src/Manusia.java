/* Nama File : Manusia.java
 * Deskripsi : Kelas abstrak sebagai cetakan dasar entitas Manusia yang memiliki data umum wajib pajak
 * Pembuat   : Adefritz Einar Sinaga / 24060124140186
 * Tanggal   : 24 Maret 2026
 */
import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Konstruktor Lengkap
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Konstruktor Tanpa Alamat (untuk p2 di Main)
    public Manusia(String nama, LocalDate tgl_mulai_kerja, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = "";
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selector dan Mutator (Getter & Setter)
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public LocalDate getTglMulaiKerja() { return tgl_mulai_kerja; }
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) { this.tgl_mulai_kerja = tgl_mulai_kerja; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public double getPendapatan() { return pendapatan; }
    public void setPendapatan(double pendapatan) { this.pendapatan = pendapatan; }

    public static int getCounterMns() { return counterMns; }

    // Abstract Method
    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama             : " + nama);
        System.out.println("Mulai Kerja      : " + tgl_mulai_kerja);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Pendapatan       : Rp " + pendapatan);
    }
}