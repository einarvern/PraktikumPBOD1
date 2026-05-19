/* Nama File : Petani.java
 * Deskripsi : Kelas turunan Manusia untuk entitas Petani yang mengimplementasikan interface Pajak
 * Pembuat   : Adefritz Einar Sinaga / 24060124140186
 * Tanggal   : 24 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() { return asal_kota; }
    public void setAsalKota(String asal_kota) { this.asal_kota = asal_kota; }

    public static int getCounterPetani() { return counterPetani; }

    @Override
    public int hitungMasaKerja() {
        // Berdasarkan Digit ke-12 NIM Anda (C = 1)
        int selisihTahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return selisihTahun + 1;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota        : " + asal_kota);
    }
}