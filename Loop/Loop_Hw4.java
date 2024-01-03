import java.util.Scanner;

public class Loop_Hw4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tulanh[] = new int[10000];
        int i = 0;
        int n = input.nextInt();
        int j;

        while (n > 0) {
            int element = n % 10;
            tulanh[i] = element;
            i++;
            n = n / 10;
        }

        for (j = 0; j < i; j++) {
            if (tulanh[j] != 0) {
                break;
            }
        }

        for (int k = j; k < i; k++) {
            System.err.print(tulanh[k]);
        }
    }
}