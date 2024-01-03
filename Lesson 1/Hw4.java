import java.util.Scanner;

public class Hw4{
	public static void main(String[] args){
		Scanner inputScanner = new Scanner(System.in);
	
		System.err.println("Enter the first number:");
		double A = inputScanner.nextDouble();

		System.err.println("Enter the second number:");
		double B = inputScanner.nextDouble();

		if (A == B) {
		System.err.println("Result: SAME");
		}

		else {
		System.err.println("Result: DIFFERENT");
		}

	}
}