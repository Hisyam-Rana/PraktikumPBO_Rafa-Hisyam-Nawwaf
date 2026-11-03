package Jobsheet08_27102026;

public abstract class Handphone extends StopKontak implements Switchable {
    private String Model;
    private int Size;
    private String Brand;

    public Handphone(String idSocket, String stationName, String location, String model, int size, String brand) {
        super(idSocket, stationName, location);
        this.Model = model;
        this.Size = size;
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public int getSize() {
        return Size;
    }

    public String getBrand() {
        return Brand;
    }

    public String getTurnOff() {
        return "Handphone turned off.";
    }

    public String getTurnOn() {
        return "Handphone turned on.";
    }

    public void setBrowsing() {
        System.out.println("Browsing in progress...");
    }

    public void setCalling() {
        System.out.println("Making a call...");
    }

    public void on() {
        System.out.println(Brand + " " + Model + " is charged with 11V. Max Voltage allowed: " + MAX_VOLTAGE + "V");
    }
}