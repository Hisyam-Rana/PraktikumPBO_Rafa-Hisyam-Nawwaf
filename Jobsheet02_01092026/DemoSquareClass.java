package Jobsheet02_01092026;

public class DemoSquareClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length =33;
        r1.wide = 21;
        r1.displayInfo();
        System.out.println("Area Of Rectangle   : "+r1.getArea());
        System.out.println("Circumference Of Rectangle   : "+r1.getCircumference());
    }
    
}
