import java.util.Scanner;

public class Loop_exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        System.err.println("Result: " + result);

    }
}
