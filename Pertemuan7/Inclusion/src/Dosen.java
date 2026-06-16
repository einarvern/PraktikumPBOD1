public class Dosen extends Civitasakademika {
    // Atribut
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}