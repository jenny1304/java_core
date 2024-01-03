package Method;

import java.util.Scanner;

public class Example2 {
    public static void sortArray(int n, int array[]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void printArray(int n, int array[]) {
        for (int i = 0; i < n; i++) {
            System.err.print(array[i] + " ");
        }
    }

    public static void enterArray(int n, int array[]) {
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            array[i] = inputScanner.nextInt();
        }

        inputScanner.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int array[] = new int[n];

        enterArray(n, array);
        sortArray(n, array);
        printArray(n, array);
        input.close();
    }
}
