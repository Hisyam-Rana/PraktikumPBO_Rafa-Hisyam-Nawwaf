package MIdterm_13102026;

public class ActiveVolcano19 extends VolcanicMountain19 {
    private int alertLevel;
    private String lastEruptionYear;

    public ActiveVolcano19(String namE, int elevatioN, String locatioN, String volcanoType, boolean isMonitored, int alertLevel, String lastEruptionYear) {
        super(namE, elevatioN, locatioN, volcanoType, isMonitored);
        this.alertLevel = alertLevel;
        this.lastEruptionYear = lastEruptionYear;
    }

    public int getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(int alertLevel) {
        this.alertLevel = alertLevel;
    }

    public String getLastEruptionYear() {
        return lastEruptionYear;
    }

    public void setLastEruptionYear(String lastEruptionYear) {
        this.lastEruptionYear = lastEruptionYear;
    }

    public void evacuateAlert() {
        System.out.println("PERINGATAN EVAKUASI! " + name + " berada pada Level Siaga " + alertLevel + "! Segera evakuasi wilayah sekitar.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level Siaga : Level " + alertLevel);
        System.out.println("Erupsi Terakhir: " + lastEruptionYear);
    }
}
