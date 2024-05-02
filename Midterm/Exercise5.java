package Midterm;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.err.println("Enter n value:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int check = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n - i - 1]) {
                check = 1;
            } else {
                System.err.println("false");
                break;
            }

        }
        if (check == 1) {
            System.err.println("true");
        }
    }
}
