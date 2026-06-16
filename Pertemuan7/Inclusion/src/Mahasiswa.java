public class Mahasiswa extends Civitasakademika {
    // Atribut
    private String nim;
    private Dosen DosenWali;

    public Mahasiswa(String Nama, String nim) {
        super(Nama);
        this.nim = nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen d) {
        this.DosenWali = d;
    }

    public void printInfoMhs() {
        System.out.println("NIM: " + nim + " | Nama: " + Nama + " | Wali: " + (DosenWali != null ? DosenWali.getNama() : "Belum ada wali"));
    }
}