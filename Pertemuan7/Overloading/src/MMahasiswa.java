public class MMahasiswa {
    public static void main(String[] args) {
        // Mahasiswa tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        // Mahasiswa dengan parameter
        Mahasiswa m2 = new Mahasiswa("40177", "Arya Paleka", "Informatika");
        // Mahasiswa dengan parameter objek
        Mahasiswa m3 = new Mahasiswa(m2);

        System.out.print("M1 (Tanpa Parameter): "); 
        m1.PrintInfo();
        System.out.print("M2 (3 Parameter): "); 
        m2.PrintInfo();
        System.out.print("M3 (Parameter Objek): "); 
        m3.PrintInfo();
        
        System.out.println("\n-- Overloading setProgramStudi --");
        
        // Varian 1
        System.out.println("--- setProgramStudi tanpa param --- ");
        m1.setProgramStudi(); 
        System.out.print("M1 :\n"); 
        m1.PrintInfo();
        
        // Varian 2
        System.out.println("--- setProgramStudi String --- ");
        m1.setProgramStudi("Teknik Komputer");
        System.out.print("M1 :\n");
        m1.PrintInfo();
        
        // Varian 3
        System.out.println("--- setProgramStudi Mahasiswa --- ");
        m1.setProgramStudi(m2);
        System.out.print("M1 : \n");
        m1.PrintInfo();
    }
}