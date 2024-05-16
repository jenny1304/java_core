package OOP.Inheritance;

public class Test {
    public static void main(String[] args) {
        // Test 1
        Circle circle = new Circle(5, "red");
        System.err.println(circle.toString());

        // Test 2
        System.err.println(circle.getArea());

        // Test 3
        Cylinder cylinder = new Cylinder(5, 2, "blue");
        System.out.println(cylinder.toString());

        // Test 4
        System.out.println(cylinder.getArea());

        // Test 5
        System.out.println(cylinder.getVolume());
    }
}
