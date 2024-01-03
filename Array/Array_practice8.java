package Array;

import java.util.Scanner;

public class Array_practice8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter value 1:");
        int value1 = input.nextInt();
        System.err.print("Enter value 2:");
        int value2 = input.nextInt();
        System.err.print("Enter value 3:");
        int value3 = input.nextInt();
        System.err.print("Enter value 4:");
        int value4 = input.nextInt();
        System.err.println("Array:" + value1 + "," + value2 + "," + value3 + "," + value4);

        int array[] = { value1, value2, value3, value4 };

        int Smallest = array[0];
        for (int value = 0; value < array.length; value++) {
            if (array[value] < array[0])
                Smallest = array[value];
        }

        System.err.println("Smallest number:" + Smallest);
    }
}
