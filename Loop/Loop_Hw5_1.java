import java.util.Scanner;

public class Loop_Hw5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter number:");
        int number = input.nextInt();
        int size = 0;
        int number1 = number;
        while (number1 > 0) {
            number1 = number1 / 2;
            size++;
        }

        int array[] = new int[size];
        int i = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            i++;
            number = number / 2;
        }

        for (int z = size - 1; z >= 0; z--) {
            System.err.print(array[z]);
        }

    }
}
