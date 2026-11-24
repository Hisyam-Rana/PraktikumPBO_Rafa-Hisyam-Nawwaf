package Jobsheet09_27102026;

public class Steker extends Handphone {

    public Steker(String idSocket, String stationName, String location, String model, int size, String brand) {
        super(idSocket, stationName, location, model, size, brand);
    }

    public void off() {
        System.out.println(getBrand() + " " + getModel() + " turned off using the power button on Steker.");
    }
}