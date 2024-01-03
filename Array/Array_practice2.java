package Array;

import java.util.Scanner;

public class Array_practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter number:");
        int number = input.nextInt();
        for (int i = 100; i > 0; i--) {
            if (i % number == 0) {
                System.err.println(i);
                break;
            }
        }

    }
}
