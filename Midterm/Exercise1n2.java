package Midterm;

import java.util.Scanner;

public class Exercise1n2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.err.println("=====================================================");
        System.err.println("To find LCM: Enter 1");
        System.err.println("To find GCD: Enter 2");
        System.err.println("To find both: Enter 3");
        System.err.println("=====================================================");

        System.err.print("Enter choice: ");
        int result = input.nextInt();

        System.err.print("Enter value 1: ");
        int value1 = input.nextInt();
        System.err.print("Enter value 2: ");
        int value2 = input.nextInt();
        int gcd = 0;
        for (int i = 1; i <= value1 && i <= value2; i++) {
            if (value1 % i == 0 && value2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = value1 * value2 / gcd;

        if (result == 1) {
            System.err.println("The lowest common multiple of " + value1 + " and " + value2 + " is " + lcm);
        } else if (result == 2) {
            System.err.println("The greatest common divisor of " + value1 + " and " + value2 + " is " + gcd);
        } else if (result == 3) {
            System.err.println("The greatest common divisor of " + value1 + " and " + value2 + " is " + gcd);
            System.err.println("The lowest common multiple of " + value1 + " and " + value2 + " is " + lcm);
        } else {
            System.err.println("Enter options [1,2,3]");
        }
    }
}
