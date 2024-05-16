import java.util.Scanner;

public class Loop_Hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.err.println(sum);

    }
}
