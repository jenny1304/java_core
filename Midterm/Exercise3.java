package Midterm;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.err.print("Enter n value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        System.err.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.err.print("Enter number to check: ");
        int num = input.nextInt();
        int check = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == num) {
                check = 0;
                break;
            } else {
                check = 1;
            }
        }
        if (check == 0) {
            System.err.println("True");
        }
        if (check == 1) {
            System.err.println("False");
        }
    }
}
