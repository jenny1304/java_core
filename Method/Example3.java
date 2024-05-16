
package Method;

import java.util.Scanner;

public class Example3 {
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

    }

    public static void insertArray(int n, int array[], int elements, int location) {

        for (int i = 0; i < n; i++) {
            if (i == location) {

                for (int j = n - 1; j >= location; j--) {
                    array[j] = array[j - 1];
                }

                array[i] = elements;
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int array[] = new int[n + 1];

        enterArray(n, array);
        int elements = input.nextInt();
        int location = input.nextInt();

        insertArray(n + 1, array, elements, location);
        printArray(n + 1, array);

        input.close();
    }
}
