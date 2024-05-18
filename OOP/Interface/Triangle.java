package OOP.Interface;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        if (p1 == null || p2 == null || p3 == null || p1.equals(p2) || p1.equals(p3)
                || p2.equals(p3)
                || getArea(p1, p2, p3) == 0) {
            System.out.println("Not Triangle");
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

    }

    public double getArea() {
        double half = this.getPerimeter() / 2;
        return Math.sqrt(half * (half - p1.distance(p2)) * (half - p1.distance(p3)) * (half - p2.distance(p3)));
    }

    public double getArea(Point p1, Point p2, Point p3) {
        double half = getPerimeter(p1, p2, p3) / 2;
        return Math.sqrt(half * (half - p1.distance(p2)) * (half - p1.distance(p3)) * (half - p2.distance(p3)));
    }

    public double getPerimeter() {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public double getPerimeter(Point p1, Point p2, Point p3) {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public String getInfo() {
        return String.format("Triangle[(%s,%s),(%s,%s),(%s,%s)]", p1.getPointX(), p1.getPointY(), p2.getPointX(),
                p2.getPointY(), p3.getPointX(), p3.getPointY());
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

}
