package Jobsheet06_29092026;

public class Hiking extends Mountain {
    private String basecamp;
    private String difficultyLevel;
    private double entryFee = 25000;
    private int dailyQuota = 200;

    public Hiking() {super();}

    public Hiking(String Name, int Elevation, String Location) {
        super(Name, Elevation, Location);
    } 

    public void setBasecamp(String baseCamp) {
        this.basecamp = baseCamp;
    }

    public void setDifficultyLevel(String DifficultyLevel) {
        this.difficultyLevel = DifficultyLevel;
    }

    public void setEntryFee(double EntryFee) {
        this.entryFee = EntryFee;
    }

    public void setEntryFee(double EntryFee, double discountPercent) {
        this.entryFee = EntryFee - (EntryFee * (discountPercent / 100.0));
    }

    public void setDailyQuota(int DailyQuota) {
    this.dailyQuota = DailyQuota;
    }

    public void printInfo() {
        System.out.println("\n==================================");
        System.out.println("        HIKING MOUNTAIN    ");
        System.out.println("==================================");
        super.printInfo();
        System.out.println("Basecamp    : " + basecamp);
        System.out.println("Grade       : " + difficultyLevel);
        System.out.println("Tiket Masuk : Rp " + this.entryFee);
    }

    public String getAccessInfo() {
        return "Akses pendakian via basecamp " + basecamp + " (Kuota harian: " + dailyQuota + " pendaki)";
    }
}