package Midterm;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter n value: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.err.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int check = 0;
        int difference = array[1] - array[0];
        for (int i = 2; i < n; i++) {
            if (array[i] - array[i - 1] == difference)
                ;
            check++;
        }

        if (check > 0) {
            System.err.println("True");
        } else if (check == 0) {
            System.err.println("False");
        }
    }
}
