public abstract class Civitasakademika {
    // Atribut
    protected String Nama;
    
    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    // method abstrak
    public abstract String getNomor();
}