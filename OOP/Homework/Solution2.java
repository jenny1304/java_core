package OOP.Homework;

public class Solution2 {
    private int numerator;
    private int denominator;

    public Solution2() {

    }

    public Solution2(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Solution2 reduce(Solution2 frac) {
        Solution2 newFrac = new Solution2();
        int gcd = GCD(frac.getNumerator(), frac.getDenominator());

        newFrac.numerator = frac.getNumerator() / gcd;
        newFrac.denominator = frac.getDenominator() / gcd;
        return newFrac;
    }

    public Solution2 add(Solution2 frac) {
        Solution2 newFrac = new Solution2();
        newFrac.numerator = this.getNumerator() * frac.getDenominator() + this.getDenominator() * frac.getNumerator();
        newFrac.denominator = this.getDenominator() * frac.getDenominator();

        newFrac = newFrac.reduce(newFrac);
        return newFrac;
    }

    public Solution2 sub(Solution2 frac) {
        Solution2 newFrac = new Solution2();
        newFrac.numerator = this.getNumerator() * frac.getDenominator() - this.getDenominator() * frac.getNumerator();
        newFrac.denominator = this.getDenominator() * frac.getDenominator();

        newFrac = newFrac.reduce(newFrac);
        return newFrac;
    }

    public static void main(String[] args) {
        // Test reduce
        Solution2 testReduce = new Solution2(6, 112);
        System.out.println(testReduce.reduce(testReduce).toString());

        //
        Solution2 number1 = new Solution2(5, 2);
        Solution2 number2 = new Solution2(6, 10);
        System.out.println(number1.add(number2).toString());
        System.out.println(number1.sub(number2).toString());

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

    @Override
    public String toString() {
        return "" + this.getNumerator() + " / " + this.getDenominator();
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
}
