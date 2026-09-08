package Jobsheet02_01092026;

public class HeadlampDemo {
    public static void main(String[] args) {
        Headlamp h1 = new Headlamp();
        h1.brand = "Luby";
        h1.strap = "Single Strap";
        h1.shape = "Proyektor";
        h1.lumens = 500;
        h1.size = "8.9x9.8x7";
        
        h1.displayInfo();
        h1.turnOn();
        System.out.println("Headlamp is in High-beam mode on "+h1.highBeam()+" lumens");
        System.out.println("Headlamp is in Low-beam mode on "+h1.lowBeam()+" lumens");
        System.out.println("Headlamp is in SOS mode");
        h1.sosMode();
        h1.turnOff();
        
        Headlamp h2 = new Headlamp();
        h2.brand = "Alltrek";
        h2.strap = "Three-point Strap";
        h2.shape = "Reflektor";
        h2.lumens = 325;
        h2.size = "11.8x9x8";
        
        h2.displayInfo();
        h2.turnOn();
        System.out.println("Headlamp is in High-beam mode on "+h2.highBeam()+" lumens");
        System.out.println("Headlamp is in Low-beam mode on "+h2.lowBeam()+" lumens");
        System.out.println("Headlamp is in SOS mode");
        h2.sosMode();
        h2.turnOff();
    }
}
