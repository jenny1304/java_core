package Midterm;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.err.print("Enter n value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        System.err.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int newArray[] = new int[n + 1];

        System.err.print("Enter position to input number: ");
        int position = input.nextInt();
        System.err.print("Enter number to input: ");
        int num = input.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if (i < position) {
                newArray[i] = array[i];
                // number inserted at the position after or exactly at k? => positon - 1
            } else if (i == position) {
                newArray[i] = num;
            } else {
                newArray[i] = array[i];
            }
        }
        System.err.print("New array: ");
        for (int i = 0; i < n + 1; i++) {
            System.err.print(newArray[i] + " ");
        }

    }
}
