package Array;

import java.util.Scanner;

public class Array_practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter number:");
        int number = input.nextInt();
        int number1 = number;
        int total = 0;
        while (number1 > 0) {
            int save = number1 % 10;
            total = total + save * save * save;
            number1 = number1 / 10;
        }
        if (total == number) {
            System.err.println("Armstrong number");
        } else {
            System.err.println("Not an Armstrong number");
        }
    }

}
