package OOP.Homework;

public class Solution {
    private int numerator;
    private int denominator;

    public Solution() {

    }

    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int GCD(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;

            } else {
                y = y - x;
            }
        }

        return y;
    }

    // Tên class viết hoa, tên biến viết thường (luật)
    public Solution reduce(Solution Solution) {
        Solution newFrac = new Solution(numerator, denominator);
        int num1 = Solution.getNumerator();
        int deno1 = Solution.getDenominator();

        int gcd = GCD(num1, deno1);

        // GCD = num1;
        newFrac.numerator = num1 / gcd;
        newFrac.denominator = deno1 / gcd;

        return newFrac;
    }

    public Solution add(Solution Solution) {
        Solution newFrac = new Solution(numerator, denominator);
        newFrac.numerator = numerator * Solution.denominator + Solution.numerator * denominator;
        newFrac.denominator = denominator * Solution.denominator;

        // System.out.println(newFrac.numerator);

        newFrac.denominator = newFrac.reduce(newFrac).getDenominator();
        newFrac.numerator = newFrac.reduce(newFrac).getNumerator();

        return newFrac;
    }

    public Solution subtract(Solution Solution) {
        Solution newFrac = new Solution(-Solution.numerator, Solution.denominator);
        return add(newFrac);
    }

    public Solution multiply(Solution Solution) {
        Solution newFrac = new Solution(numerator, denominator);
        newFrac.numerator = numerator * Solution.numerator;
        newFrac.denominator = denominator * Solution.denominator;
        newFrac.denominator = newFrac.reduce(newFrac).getDenominator();
        newFrac.numerator = newFrac.reduce(newFrac).getNumerator();
        return newFrac;
    }

    public Solution divide(Solution Solution) {
        Solution newFrac = new Solution(Solution.denominator, Solution.numerator);
        return multiply(newFrac);

    }

    public boolean equals(Solution obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (obj.numerator == this.numerator && obj.denominator == this.denominator) {
                return true;
            }
        }
        return false;

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static void main(String[] args) {
        // Test case 1
        Solution number1 = new Solution(5, 2);
        Solution number2 = new Solution(6, 10);

        // Test reduce
        // Solution result = new Solution();
        // System.out.println(result.reduce(number2).getDenominator());

        // Test add
        // System.err.println(number1.add(number2).getNumerator());
        // System.err.println(number1.add(number2).getDenominator());

        // Test multiply
        System.err.println(number1.multiply(number2).getNumerator());
        System.err.println(number1.multiply(number2).getDenominator());

        // Test case 3

        // System.err.println(
        // "Simplified fraction = " + number1.reduce(number1).numerator + "/"
        // + number1.reduce(number1).denominator);
        // System.err.println("Addition = " + number1.add(number2).numerator + "/" +
        // number1.add(number2).denominator);
        // System.err.println(
        // "Subtraction = " + number1.subtract(number2).numerator + "/" +
        // number1.subtract(number2).denominator);
        // System.err.println("Multiplication = " + number1.multiply(number2).numerator
        // + "/"
        // + number1.multiply(number2).denominator);
        // System.err.println("Division = " + number1.divide(number2).numerator + "/"
        // + number1.divide(number2).denominator);
        // System.err.println(number1.equals(number2));

    }
}
