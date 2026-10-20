package Jobsheet07_12102026;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println("=== UJI COBA METHOD OVERLOADING SEGITIGA ===\n");

        int sudut1 = sg.totalSudut(60);
        System.out.println("Total Sudut (1 parameter: sudutA = 60) : " + sudut1);

        int sudut2 = sg.totalSudut(60, 40);
        System.out.println("Total Sudut (2 parameter: sudutA = 60, sudutB = 40) : " + sudut2);

        System.out.println("---------------------------------------------");

        int keliling1 = sg.keliling(3, 4, 5);
        System.out.println("Keliling (3 parameter: sisiA = 3, sisiB = 4, sisiC = 5) : " + keliling1);

        double keliling2 = sg.keliling(3, 4);
        System.out.println("Sisi miring / c (2 parameter: sisiA = 3, sisiB = 4) : " + keliling2);
    }
}