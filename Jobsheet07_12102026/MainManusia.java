package Jobsheet07_12102026;

public class MainManusia {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        m1.bernafas();
        m1.makan(); 

        System.out.println("--------------------------");

        m2.bernafas();
        m2.makan();
    }
}