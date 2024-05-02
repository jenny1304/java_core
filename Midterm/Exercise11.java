package Midterm;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        System.err.print("Enter n value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        System.err.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.err.print("Enter value to delete: ");
        Scanner delete = new Scanner(System.in);
        int value = delete.nextInt();
        for (int i = value; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < n - 1; i++) {
            System.err.print(array[i] + " ");
        }

    }

}
