public class MCivitasA {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Khadijah, S.Kom., M.Cs.", "12345");
        Dosen d2 = new Dosen("Edy SUharto, S.T., M.Kom.", "67890");

        Mahasiswa m1 = new Mahasiswa("Adefritz Einar Sinaga", "24060124140186");
        Mahasiswa m2 = new Mahasiswa("Muhammad Rizky", "24060124130099");
        Mahasiswa m3 = new Mahasiswa("Dina Aprilia", "24060124140111");
        Mahasiswa m4 = new Mahasiswa("Bima Arya", "24060124120045");
        Mahasiswa m5 = new Mahasiswa("Citra Kirana", "24060124140122");

        m1.setWali(d1);
        m2.setWali(d2);
        m3.setWali(d1);
        m4.setWali(d2);
        m5.setWali(d1);

        Seminar seminarPBO = new Seminar();

        seminarPBO.registrasi(d1);
        seminarPBO.registrasi(d2);
        seminarPBO.registrasi(m1);
        seminarPBO.registrasi(m2);
        seminarPBO.registrasi(m3);
        seminarPBO.registrasi(m4);
        seminarPBO.registrasi(m5);

        seminarPBO.tampilPeserta();
        System.out.println("\nTotal Peserta: " + seminarPBO.countPeserta());
        System.out.println("Total Mahasiswa: " + seminarPBO.countMahasiswa());
        
        System.out.println("\n--- Data Mahasiswa ---");
        m1.printInfoMhs();
        m2.printInfoMhs();
        m3.printInfoMhs();
        m4.printInfoMhs();
        m5.printInfoMhs();
    }
}