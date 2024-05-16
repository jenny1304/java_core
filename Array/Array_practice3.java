package Array;

import java.util.Scanner;

public class Array_practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter number:");
        int number = input.nextInt();
        int number1 = number;
        int total = 0;
        while (number1 > 0) {
            int save = number1 % 10;
            total = total + save;
            number1 = number1 / 10;
        }
        if (number % total == 0) {
            System.err.println("Harshad number");
        } else {
            System.err.println("Not an Harshad number");
        }
    }

}
