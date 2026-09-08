package Jobsheet03_08092026;

public class MotorDemo {
    public static void main(String[] args) {
        // --- Motor 1 ---
        Motor motor1 = new Motor();
        motor1.displayStatus();
        
        motor1.platNomor = "B 0838 XZ";
        // motor1.kecepatan=50;
        // motor1.displayStatus();
        
        int kecepatanBaru1 = 50;
        if (!motor1.isMesinOn && kecepatanBaru1 > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru1;
        }
        motor1.displayStatus();

        // --- Motor 2 ---
        Motor motor2 = new Motor();
        // motor2.platNomor = "N 9840 AB";
        // motor2.isMesinOn = true;
        // motor2.kecepatan=40;
        // motor2.displayStatus();
        
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        int kecepatanBaru2 = 40;
        if (!motor2.isMesinOn && kecepatanBaru2 > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecepatanBaru2;
        }
        motor2.displayStatus();

        // --- Motor 3 ---
        Motor motor3 = new Motor();
        // motor3.platNomor = "D 8343 CV";
        // motor3.kecepatan=60;
        // motor3.displayStatus();
        
        motor3.platNomor = "D 8343 CV";
        int kecepatanBaru3 = 60;
        if (!motor3.isMesinOn && kecepatanBaru3 > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor3.kecepatan = kecepatanBaru3;
        }
        motor3.displayStatus();
    }
}
