public class Seminar {
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int banyakPeserta;

    public Seminar() {
        this.banyakPeserta = 0;
    }

    // C. Fungsi countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // D. Prosedur registrasi
    public void registrasi(Civitasakademika p) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = p;
            banyakPeserta++;
        } else {
            System.out.println("Seminar penuh!");
        }
    }

    // G. Prosedur tampilPeserta
    public void tampilPeserta() {
        System.out.println("--- Daftar Peserta Seminar ---");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + ". " + pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    // H. Fungsi countMahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}