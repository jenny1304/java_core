package OOP.Homework;

public class point {

    private double x;
    private double y;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public point() {

    }

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(point point) {
        double dist = Math.sqrt((y - point.getY()) * (y - point.getY()) + (x - point.getX()) * (x - point.getX()));
        return dist;
    }

    public double distance(double x2, double y2) {
        double dist = Math.sqrt((y - y2) * (y - y2) + (x - x2) * (x - x2));
        return dist;
    }

}
