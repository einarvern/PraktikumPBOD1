import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dosentetap dt = new Dosentetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        dt.printInfo();
        System.out.println();

        Dosentamu dtm = new Dosentamu("9876543210", "Budi", LocalDate.of(1988, 8, 12), LocalDate.of(2020, 3, 1), 4500000, "Fakultas Sains dan Matematika", "88234711", LocalDate.of(2027, 12, 31));
        dtm.printInfo();
        System.out.println();

        Tendik td = new Tendik("1234567890", "Siti", LocalDate.of(1995, 11, 23), LocalDate.of(2018, 6, 15), 4000000, "Akademik");
        td.printInfo();
    }
}