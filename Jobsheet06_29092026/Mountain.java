package Jobsheet06_29092026;

public abstract class Mountain {
    public String name;
    public int elevation;
    public String location;

    public Mountain() {}

    public Mountain(String Name, int Elevation, String Location) {
        this.name = Name;
        this.elevation = Elevation;
        this.location = Location;
    }

    public void printInfo() {
        System.out.println("Nama Gunung : " + name);
        System.out.println("Ketinggian  : " + elevation + " mdpl");
        System.out.println("Lokasi      : " + location);
    }

    public abstract String getAccessInfo();
}