package Jobsheet08_27102026;

public class SoundSystem extends StopKontak implements Switchable {
    private String Brand;
    private double Size;
    private String Model;
    private int Volume;

    public SoundSystem(String idSocket, String stationName, String location, String brand, double size, String model, int volume) {
        super(idSocket, stationName, location);
        this.Brand = brand;
        this.Size = size;
        this.Model = model;
        this.Volume = volume;
    }

    public int setVolume(int volume) {
        this.Volume = volume;
        return this.Volume;
    }

    public String getBrand() {
        return Brand;
    }

    public double getSize() {
        return Size;
    }

    public String getModel() {
        return Model;
    }

    public String getTurnOn() {
        return "Sound System turned on.";
    }

    public String getTurnOff() {
        return "Sound System turned off.";
    }

    public int getAddVolume() {
        return ++Volume;
    }

    public int getReduceVolume() {
        return --Volume;
    }

    public void on() {
        System.out.println("Sound System " + Brand + " is powered ON. Max Voltage: " + MAX_VOLTAGE + "V).");
    }

    public void off() {
        System.out.println("Sound System " + Brand + " is powered OFF.");
    }
}
