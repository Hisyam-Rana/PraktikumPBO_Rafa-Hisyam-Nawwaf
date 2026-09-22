package Jobsheet04_15092026;
public class StopKontak {
    private String idSocket;
    private boolean isConnect;
    private Device deviceConnected;

    public StopKontak(String idSocket) {
        this.idSocket = idSocket;
        this.isConnect = false;
        this.deviceConnected = null;
    }

    public void plugDevice(Device dvc) {
        this.deviceConnected = dvc;
        this.isConnect = true;
        System.out.println(dvc.getDeviceName() + " Succesfully plugged to" + idSocket);
    }

    public void unplugDevice() {
        if (isConnect && deviceConnected != null) {
            System.out.println(deviceConnected.getDeviceName() + " unplug from socket- " + idSocket);
            this.deviceConnected = null;
            this.isConnect = false;
        } else {
            System.out.println("Socket " + idSocket + " is empty.");
        }
    }

    public Device getDeviceConnected() {
        return deviceConnected;
    }

    public boolean isConnect() {
        return isConnect;
    }
    
    public String getIdSocket() {
        return idSocket;
    }
}
