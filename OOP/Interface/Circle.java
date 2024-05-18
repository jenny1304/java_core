package OOP.Interface;

public class Circle implements GeometricObject {
    private double pi = 3.14;
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * radius * pi;
    }

    public String getInfo() {
        return String.format("Circle[(%s,%s),r=%.2f]", center.getPointX(), center.getPointY(), radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
