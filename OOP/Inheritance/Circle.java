package OOP.Inheritance;

public class Circle {
    private double radius;
    private String color;
    // PI = 3.14
    // static dung de khong phai tao doi tuong
    protected final static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    // Override dùng để chỉ thị ghi đè lại phương thức của class Object
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    public static void main(String[] args) {

    }
}
