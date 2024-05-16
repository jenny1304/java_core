import java.util.Scanner;

public class Loop_exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter value: ");

        int number = input.nextInt();
        if (number < 1) {
            System.err.println("Not a prime number");
        }
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                System.err.println("Not a prime number");
                break;
            }
        }

        if (count == 0) {
            System.err.println("Is a prime number");
        }

    }
}
