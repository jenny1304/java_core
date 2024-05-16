package Midterm;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.err.print("Enter n value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        int newArray[] = new int[n];

        System.err.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int duplicate[] = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    duplicate[count] = array[i];
                    count++;
                    break;
                }
            }
        }

        int count1 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                if (array[i] != duplicate[j]) {
                    newArray[count1] = array[i];
                    count1++;
                    break;
                }
            }
        }

        System.err.print("New array: ");
        for (int i = 0; i < count1; i++) {
            System.err.print(newArray[i] + " ");
        }

        input.close();
    }
}
