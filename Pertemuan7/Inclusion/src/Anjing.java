public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void suara() {
        System.out.println(nama + " bersuara 'guk-guk'");
    }
    
}