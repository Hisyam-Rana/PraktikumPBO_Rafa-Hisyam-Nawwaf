package Jobsheet06_29092026;

public class MTDemo {
    public static void main(String[] args) {

        Hiking gunung1 = new Hiking();
        gunung1.name = "Mahameru";
        gunung1.elevation = 3676;
        gunung1.location = "Jawa Timur";
        gunung1.setBasecamp("Ranu Pani");
        gunung1.setDifficultyLevel("Moderate");
        gunung1.printInfo();
        System.out.println("Info Akses Hiking : " + gunung1.getAccessInfo());

        Conservation gunung2 = new Conservation(
            "Pegunungan Anjasmoro", 2282, "Jawa Timur", 
            "Owa Jawa","Fauna", "Cagar Alam", "BBKSDA", true
        );
        gunung2.printInfo();
        System.out.println("Info Akses Konservasi : " + gunung2.getAccessInfo());

        gunung1 = new Hiking("Mt. Tanggung", 1406, "Jawa Timur");
        gunung1.setBasecamp("Nongkojajar");
        gunung1.setDifficultyLevel("Easy");
        gunung1.setEntryFee(30000, 30);
        gunung1.setDailyQuota(250);
        gunung1.printInfo();
        System.out.println("Info Akses Hiking : " + gunung1.getAccessInfo());
    }
}