
import java.util.Scanner;

public class Loop_Hw5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter number:");
        int number = input.nextInt();

        int save;

        while (number > 0) {
            if (number % 2 == 0) {
                System.err.print("0");

            } else {
                System.err.print("1");
            }

            number = number / 2;
        }
    }
}
