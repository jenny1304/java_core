package Array;

import java.util.Scanner;

public class Array_HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter Date of birth:");
        int date = input.nextInt();
        System.err.print("Enter Month of Birth:");
        int month = input.nextInt();
        System.err.print("Enter Year of Birth:");
        int year = input.nextInt();
        System.err.print("Result: " + date + "/" + month + "/" + year);
    }
}
