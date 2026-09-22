package Jobsheet04_15092026;

public class SKDemo {
    public static void main(String[] args) {
        StopKontakStation stasiun = new StopKontakStation("Main Station", "Kitchen");

        StopKontak socket1 = new StopKontak("SK-01");
        StopKontak socket2 = new StopKontak("SK-02");
        StopKontak socket3 = new StopKontak("SK-03");
        StopKontak socket4 = new StopKontak("SK-04");

        stasiun.addSocket(socket1);
        stasiun.addSocket(socket2);
        stasiun.addSocket(socket3);
        stasiun.addSocket(socket4);

        Device Refrigerator = new Device("Refrigerator", "Electronic", 150.5);
        Device PhoneCharger = new Device("Charger HP", "Aksesoris", 33.0);

        stasiun.displayAllSocketStatus();
        System.out.println();
        socket1.plugDevice(Refrigerator);
        socket4.plugDevice(PhoneCharger);

        stasiun.displayAllSocketStatus();
        System.out.println("Total Current Power Consumption: " + stasiun.calculateTotalPowerConsumption() + " Watt");

        System.out.println("\n-- Unplug The Charger --");
        socket2.unplugDevice();

        stasiun.displayAllSocketStatus();
        System.out.println("Total Current Power Consumption: " + stasiun.calculateTotalPowerConsumption() + " Watt");
    }
}
