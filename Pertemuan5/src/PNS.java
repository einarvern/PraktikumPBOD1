/* Nama File : PNS.java
 * Deskripsi : Kelas turunan Manusia untuk entitas PNS yang mengimplementasikan interface Pajak
 * Pembuat   : Adefritz Einar Sinaga / 24060124140186
 * Tanggal   : 24 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasaKerja() {
        // Berdasarkan Digit ke-14 NIM Anda (A = 6)
        int selisihTahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return selisihTahun + 6;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP              : " + nip);
    }
}