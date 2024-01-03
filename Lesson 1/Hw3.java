import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.err.println("Enter value:");
		double A = inputScanner.nextDouble();

		if (A > 0) {
			System.err.print("Result: ");
			System.err.println("Number greater than 0");
		}

		else {
			System.err.println("Number smaller than 0");
		}

	}
}