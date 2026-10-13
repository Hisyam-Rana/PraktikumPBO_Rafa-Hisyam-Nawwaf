package MidTermExam_13102026;

public class DemoMountain19 {
    public static void main(String[] args) {
        ActiveVolcano19 merapi = new ActiveVolcano19(
            "Gunung Merapi", 
            2930, 
            "Yogyakarta & Jawa Tengah", 
            "Stratovolcano", 
            true, 
            3, 
            "2023"
        );

        merapi.displayInfo();
        System.out.println("-----------------------------------");
        merapi.checkActivityStatus();
        merapi.checkActivityStatus("Pak Joko");
        merapi.checkActivityStatus(3, "Terpantau ada awan panas guguran kecil.");
        System.out.println("-----------------------------------");
        merapi.evacuateAlert(); 
    }
}
