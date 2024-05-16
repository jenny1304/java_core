package Exceptions;

public class Numeral extends Expression {
    private double value;

    public Numeral() {
        value = 0;
    }

    public Numeral(double value) {
        this.value = value;
    }

    public String toString() {
        return String.format("%.2f", value);
    }

    public double evaluate() {
        return value;
    }
}
