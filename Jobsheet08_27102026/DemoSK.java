package Jobsheet08_27102026;

public class DemoSK {
    public static void main(String[] args) {
        StopKontakStation station = new StopKontakStation("Stasiun Suhat", "Malang");

        Handphone hp1 = new Steker("SK-01", "Stasiun Suhat", "Malang", "Galaxy S24", 6, "Samsung");
        
        SoundSystem speaker1 = new SoundSystem("SK-02", "Stasiun Suhat", "Malang", "JBL", 12.5, "Boombox", 10);

        station.addSocket(hp1);
        station.addSocket(speaker1);

        System.out.println("=== STATUS STASIUN STOP KONTAK ===");
        station.displayAllSocketStatus();
        System.out.println();

        System.out.println("=== DEMO OBJEK HANDPHONE (MELALUI SUBCLASS SMARTPHONE) ===");
        hp1.plugDevice(hp1);
        hp1.on();                  
        hp1.setBrowsing();         
        hp1.setCalling();
        hp1.off();                 
        hp1.unplugDevice();
        
        System.out.println();

        System.out.println("=== DEMO OBJEK SOUND SYSTEM ===");
        speaker1.plugDevice(speaker1);
        speaker1.on();
        speaker1.setVolume(15);
        speaker1.getAddVolume();
        speaker1.off();
        speaker1.unplugDevice();
    }
}

