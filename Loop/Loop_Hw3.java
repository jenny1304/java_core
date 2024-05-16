import java.util.Scanner;

public class Loop_Hw3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 0;

        while (n > 0) {
            int element = n % 10;
            total = total + element;
            n = n / 10;
        }

        System.err.println(total);
    }

}
