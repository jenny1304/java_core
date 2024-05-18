package OOP.Interface;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double distance(Point other) {
        return Math.sqrt(
                Math.pow(this.getPointX() - other.getPointX(), 2) + Math.pow(this.getPointY() - other.getPointY(), 2));
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }
}
