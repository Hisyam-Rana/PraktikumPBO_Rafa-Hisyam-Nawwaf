package Jobsheet04_15092026;
import java.util.ArrayList;

public class StopKontakStation {
    private String stationName;
    private String location;
    private ArrayList<StopKontak> socketList;

    public StopKontakStation(String name, String locate) {
        this.stationName = name;
        this.location = locate;
        this.socketList = new ArrayList<>();
    }

    public void addSocket(StopKontak socket) {
        socketList.add(socket);
    }

    public void displayAllSocketStatus() {
        System.out.println("\n=== Status " + stationName + " (" + location + ") ===");
        if (socketList.isEmpty()) {
            System.out.println("T here are no sockets registered at this station yet.");
            return;
        }
        
        for (StopKontak sk : socketList) {
            if (sk.isConnect()) {
                System.out.print("Socket " + sk.getIdSocket() + " [Filled] -> ");
                sk.getDeviceConnected().displayInfo();
            } else {
                System.out.println("Socket " + sk.getIdSocket() + " [Empty]");
            }
        }
    }

    public double calculateTotalPowerConsumption() {
        double totalPower = 0;
        for (StopKontak sk : socketList) {
            if (sk.isConnect()) {
                totalPower += sk.getDeviceConnected().getWattPower();
            }
        }
        return totalPower;
    }
}
