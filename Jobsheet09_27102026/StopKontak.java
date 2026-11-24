package Jobsheet09_27102026;

public class StopKontak extends StopKontakStation {
    private String idSocket;
    private boolean isConnet;
    private Object deviceConnected;

    public StopKontak(String idSocket, String name, String locate) {
        super(name, locate);
        this.idSocket = idSocket;
        this.isConnet = false;
    }

    public void plugDevice(Object dvc) {
        this.deviceConnected = dvc;
        this.isConnet = true;
    }

    public void unplugDevice() {
        this.deviceConnected = null;
        this.isConnet = false;
    }

    public boolean isConnect() {
        return isConnet;
    }

    public String getIdSocket() {
        return idSocket;
    }
}