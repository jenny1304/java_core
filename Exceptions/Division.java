package Exceptions;

public class Division extends BinaryExpression {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return String.format("(%s / %s)", left.toString(), right.toString());
    }

    public double evaluate() {
        double result = 0;
        try {
            result = left.evaluate() / right.evaluate();
        } catch (ArithmeticException error) {
            System.out.println("Loi chia cho 0");
        }

        return result;
    }
}
