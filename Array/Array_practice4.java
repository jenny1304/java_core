package Array;

import java.util.Scanner;

public class Array_practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter number:");
        int number = input.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total > number) {
            System.err.println("Abundant number");
        } else {
            System.err.println("Not an Abundant number");
        }
    }
}
