package Midterm;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.err.print("Enter n value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        System.err.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int check = 0;
        for (int i = 2; i < n; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                check = 1;
            }
        }

        if (check == 0) {
            System.err.println("Flase");
        } else if (check == 1) {
            System.err.println("True");
        }
    }
}
