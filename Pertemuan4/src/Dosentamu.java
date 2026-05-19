import java.time.LocalDate;
import java.time.Period;

public class Dosentamu extends Dosen {
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    public Dosentamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    public int getSisaKontrakBulan() {
        Period p = Period.between(LocalDate.now(), tanggalBerakhirKontrak);
        return (p.getYears() * 12) + p.getMonths();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP                  : " + nip);
        System.out.println("NIDK                 : " + nidk);
        System.out.println("Nama                 : " + nama);
        System.out.println("Tanggal Lahir        : " + formatTanggal(tanggalLahir));
        System.out.println("TMT                  : " + formatTanggal(tmt));
        System.out.println("Jabatan              : Dosen Tamu");
        System.out.println("Fakultas             : " + fakultas);
        System.out.println("Masa Kerja           : " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Masa Kontrak Berakhir: " + getSisaKontrakBulan() + " bulan");
        System.out.println("Gaji Pokok           : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan            : " + formatRupiah(getTunjangan()));
    }
}