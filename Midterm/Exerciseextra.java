package Midterm;

import java.util.Scanner;

public class Exerciseextra {
    static int pow(int number, int n) {
        int total = 1;
        for (int i = 0; i < n; i++) {
            total = total * number;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter number:");
        int number = input.nextInt();
        int count = 0;
        int newNumber = number;
        int newNumber2 = number;
        int check = 0;

        while (newNumber > 0) {
            count++;
            newNumber = newNumber / 10;
        }

        while (newNumber2 > 0) {
            check = check + pow(newNumber2 % 10, count);
            newNumber2 = newNumber2 / 10;
        }

        if (check == number) {
            System.err.println("True");
        } else {
            System.err.println("False");
        }
    }

}
