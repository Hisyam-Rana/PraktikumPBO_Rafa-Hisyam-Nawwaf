package Jobsheet02_01092026;

public class Headlamp {
    public String brand;
    public String strap;
    public String shape;
    public int lumens;
    public String size;
    
    void displayInfo(){
        System.out.println("Brand   : "+brand);
        System.out.println("Strap   : "+strap);
        System.out.println("Shape   : "+shape);
        System.out.println("Lumens  : "+lumens);
        System.out.println("Size    : "+size+"cm");
    }
    
    void turnOn(){
    System.out.println("Headlamp is ON");
    }
    
    void turnOff(){
    System.out.println("Headlamp is Off");
    }
    
    void sosMode(){
        System.out.println("...___...___...___...");
    }
    
    public int highBeam(){
        return lumens;
    }
    
    public int lowBeam(){
        double loomens = (double) lumens;
        return (int) (loomens * 0.5);
    }
}
