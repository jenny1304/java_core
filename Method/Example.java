package Method;

import java.util.Scanner;

public class Example {
    public static void fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn;

        System.err.print("0 1 ");
        for (int i = 0; i < n - 2; i++) {
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;
            System.err.print(fn + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        fibonacci(n);
        input.close();
    }
}
