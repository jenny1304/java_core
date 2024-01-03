import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int A = inputScanner.nextInt();
        int B = inputScanner.nextInt();

        if (A == 0 && B == 0) {
            System.err.println("You win");
        } else {
            System.err.println("You lost");
        }
    }
}
