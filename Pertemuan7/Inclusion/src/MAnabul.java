public class MAnabul {
    public static void main(String[] args) {
        Anabul A;

        System.out.println("--- Kucing ---");
        A = new Kucing("Micky");
        A.gerak();
        A.suara();

        System.out.println("\n--- Anjing ---");
        A = new Anjing("Vivi");
        A.gerak();
        A.suara();

        System.out.println("\n--- Burung ---");
        A = new Burung("I-AN");
        A.gerak();
        A.suara();
    }
}