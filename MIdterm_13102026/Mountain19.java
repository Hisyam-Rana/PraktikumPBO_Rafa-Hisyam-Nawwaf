package MIdterm_13102026;

public class Mountain19 {
    protected String name;
    protected int elevation;
    protected String location;

    public Mountain19(String namE, int elevatioN, String locatioN) {
        this.name = namE;
        this.elevation = elevatioN;
        this.location = locatioN;
    }

    public void displayInfo() {
        System.out.println("Nama Gunung : " + name);
        System.out.println("Ketinggian  : " + elevation + " mdpl");
        System.out.println("Lokasi      : " + location);
    }
}
