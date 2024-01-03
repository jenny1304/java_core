import java.util.Scanner;

public class Loop_Hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int counteven = 0;
        int countodd = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                counteven++;
                System.err.print(i + " ");
            }

        }
        System.err.println();
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                countodd++;
                System.err.print(i + " ");
            }

        }
        System.err.println();
        System.err.println(counteven);
        System.err.println(countodd);
    }
}
