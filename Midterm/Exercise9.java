package Midterm;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.err.print("Enter n value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        System.err.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int newamount = n;
        for (int i = 0; i < newamount; i++) {
            for (int j = i + 1; j < newamount; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[newamount - 1];
                    newamount--;
                }
            }
        }

        int newArray[] = Arrays.copyOf(array, newamount);

        System.err.print("New array: ");
        for (int i = 0; i < newamount; i++) {
            System.err.print(newArray[i] + " ");
        }
    }
}
