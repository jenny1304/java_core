package Array;

import java.util.Scanner;

public class Array_practice10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int value1 = input.nextInt();
        // int value2 = input.nextInt();
        // int value3 = input.nextInt();
        // int value4 = input.nextInt();
        // int value5 = input.nextInt();
        // int value6 = input.nextInt();
        // int array[] = { value1, value2, value3, value4, value5, value6 };

        int n;
        System.err.println("Enter n: ");
        n = input.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.err.print("Enter array " + (i + 1) + ":");

            array[i] = input.nextInt();
        }

        if (array[0] == array[n - 1]) {
            System.err.println("Equal");
        } else {
            System.err.println("Not equal");
        }

    }

}
