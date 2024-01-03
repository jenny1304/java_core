import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.err.print("Enter value:");
        double R = inputScanner.nextDouble();
        if (R > 0) {
            double S = R * R * 3.14;
            System.err.print("Result: \n");
            System.err.println(S);
        }

        else {
            System.err.println("Error");
        }

    }
}
