package Array;

import java.util.Scanner;

public class Array_practice11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter number:");
        int A = input.nextInt();
        int B = input.nextInt();
        // CÁCH 1
        // while (A != B) {
        // if (A > B) {
        // A = A - B;
        // } else {
        // B = B - A;
        // }
        // }
        // System.err.println(A);

        // CÁCH 2
        while (A * B != 0) {
            if (A > B) {
                A = A % B;
            } else {
                B = B % A;
            }

        }

        System.err.println(A + B);
    }
}
