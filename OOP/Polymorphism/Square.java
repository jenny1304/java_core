package OOP.Polymorphism;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getLength();

    }

    public void setSide(double side) {
        this.setWidth(side);
    }

    public void setWidth(double side) {
        this.setWidth(side);
    }

    public void setLength(double side) {
        this.setWidth(side);
    }

    public String toString() {
        return String.format("Square[side=%s,color=%s,filled=%s]", this.getSide(), color, filled);
    }

}
