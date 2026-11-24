package Jobsheet08_27102026;

public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Standing Fan", 350000.0, "Putih", "Cosmos");
        TV tv = new TV("OLED", 20, 5500000.0, "Hitam", "LG");
        Kulkas kulkas = new Kulkas(2, 3800000.0, "Silver", "Samsung");
        SmartFridge smartFridge = new SmartFridge(15, 4, 12000000.0, "Matte Black", "LG ThinQ");

        tv.naikkanVolume(5);
        tv.turunkanVolume(2);

        smartFridge.naikkanVolume(10);
        smartFridge.turunkanVolume(3);

        System.out.println(kipas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
    }
}