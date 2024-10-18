package oops;
import bank.*;


class Shape {
    protected String color;

    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public double area(double l, double h) {
        return ((1 / 2) * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public int area(int l, int h) {
        return l * h * (1 / 2);
    }
}

public class OOPS {

    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.color = "red";
        // System.out.println(" The color is: " + t1.color);
        // EquilateralTriangle e1 = new EquilateralTriangle();
        // e1.color = "blue";
        // System.out.println(e1.color);
        Bank b1 = new Bank();
        System.out.println(b1.account.name);
        b1.displayInfo();
    }
}