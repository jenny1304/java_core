package OOP;

import java.util.Scanner;

class Info {
    double length = 2;
    double width;
}

public class Exercise1 {
    private double length = 2;
    private double width;

    void getInformation() {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter length: ");
        length = input.nextDouble();
        System.err.print("Enter width: ");
        width = input.nextDouble();
    }

    double getArea() {
        double area = width * length;
        return area;
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    void display() {
        System.err.println("The area is " + getArea());
        System.err.println("The perimeter is " + getPerimeter());
    }

    public static void main(String[] args) {
        Info obj = new Info();
        System.err.println(obj.length);
    }
}
