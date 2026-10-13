package MidTermExam_13102026;

public class VolcanicMountain19 extends Mountain19 {
    protected String volcanoType;
    protected boolean isMonitored;

    public VolcanicMountain19(String namE, int elevatioN, String locatioN, String volcanoType, boolean isMonitored) {
        super(namE, elevatioN, locatioN);
        this.volcanoType = volcanoType;
        this.isMonitored = isMonitored;
    }

    public void checkActivityStatus() {
        System.out.println("Status Pemantauan " + name + ": " + (isMonitored ? "Aktif Dipantau" : "Tidak Dipantau"));
    }

    public void checkActivityStatus(String officerName) {
        System.out.println("Petugas " + officerName + " melaporkan: Status pemantauan " + name + " terpantau aman.");
    }

    public void checkActivityStatus(int customLevel, String notes) {
        System.out.println("Cek Aktivitas Khusus " + name + " -> Level: " + customLevel + " | Catatan: " + notes);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe Gunung : " + volcanoType);
        System.out.println("Dipantau    : " + (isMonitored ? "Ya" : "Tidak"));
    }
}
