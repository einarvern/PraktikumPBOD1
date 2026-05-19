/* Nama File : Pengusaha.java
 * Deskripsi : Kelas turunan Manusia untuk entitas Pengusaha yang mengimplementasikan interface Pajak
 * Pembuat   : Adefritz Einar Sinaga / 24060124140186
 * Tanggal   : 24 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() { return npwp; }
    public void setNpwp(String npwp) { this.npwp = npwp; }

    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public int hitungMasaKerja() {
        // Berdasarkan Digit ke-13 NIM Anda (B = 8)
        int selisihTahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return selisihTahun + 8;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP             : " + npwp);
    }
}