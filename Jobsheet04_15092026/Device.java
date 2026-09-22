package Jobsheet04_15092026;

public class Device {
    private String deviceName;
    private String category;
    private double Wattage;

    public Device(String name, String catgr, double watt) {
        this.deviceName = name;
        this.category = catgr;
        this.Wattage = watt;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public double getWattPower() {
        return Wattage;
    }

    public void displayInfo() {
        System.out.println("Device: " + deviceName + " | Category: " + category + " | Power: " + Wattage + " Watt");
    }
}
