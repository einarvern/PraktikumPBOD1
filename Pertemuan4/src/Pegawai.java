/* Nama File : Pegawai.java
 * Deskripsi : Kelas induk (superclass) yang mendefinisikan atribut dasar pegawai beserta metode perhitungan masa kerja dan format data
 * Pembuat   : Adefritz Einar Sinaga / 24060124140186
 * Tanggal   : 19 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String formatTanggal(LocalDate date) {
        String[] bulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return date.getDayOfMonth() + " " + bulan[date.getMonthValue()] + " " + date.getYear();
    }

    public int getMasaKerjaTahun() {
        return Period.between(tmt, LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan() {
        return Period.between(tmt, LocalDate.now()).getMonths();
    }

    public LocalDate getTanggalPensiun(int bup) {
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    public String formatRupiah(double uang) {
        return String.format("Rp %,.2f", uang).replace(",", "X").replace(".", ",").replace("X", ".");
    }

    public void printInfo() {
    }
}