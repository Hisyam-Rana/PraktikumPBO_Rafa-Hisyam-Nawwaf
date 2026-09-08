package Jobsheet02_01092026;

public class Rectangle {
    public int length;
    public int wide;
    
    void displayInfo(){
        System.out.println("Length  : "+ length);
        System.out.println("Wide    : "+wide);
    }
    
    public int getArea(){
        return length * wide;
    }
    
    public int getCircumference(){
        return 2 * (length + wide);
    }
}
