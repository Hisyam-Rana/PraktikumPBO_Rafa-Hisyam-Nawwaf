package Jobsheet09_27102026;

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
        System.out.println("Station: " + stationName + " at " + location);
        for (StopKontak s : socketList) {
            System.out.println("Socket ID: " + s.getIdSocket() + ", Connected: " + s.isConnect());
        }
    }
}