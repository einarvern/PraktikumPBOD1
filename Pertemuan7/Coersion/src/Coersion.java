public class Coersion {
    public static void main(String[] args) throws Exception {
        System.out.println(" 1A ");
        int angka = 65;
        System.out.println("Integer :" + angka);
        System.out.println("Character :" + (char) angka);
        System.out.println("Real (double) :" + (double) angka);
        System.out.println();

        System.out.println(" 1B ");
        int intAsli = 10;
        double keReal = (double) intAsli;
        int balikKeInt = (int) keReal;
        System.out.println("Nilai awal: " + intAsli);
        System.out.println("Setelah ke real: " + keReal);
        System.out.println("Kembali ke int: " + balikKeInt);
        System.out.println();

        System.out.println(" 1C ");
        String X = "1234";
        String Y = "5678";
        String S = X + Y; 
        int Z = Integer.parseInt(X) + Integer.parseInt(Y); 
        System.out.println("Hasil Konkatenasi (S): " + S);
        System.out.println("Hasil Penjumlahan (Z): " + Z);
        System.out.println();

        System.out.println(" 1D ");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q); 
        System.out.println("Hasil Konkatenasi (R): " + R);
        System.out.println("Hasil Penjumlahan (D): " + D);
        System.out.println();

        System.out.println(" 1E ");
        Integer A = Integer.parseInt(S);
        System.out.println("Nilai A: " + A);
        System.out.println();

        System.out.println(" 1F ");
        String T = A.toString();
        System.out.println("Nilai T: " + T);
    }
}