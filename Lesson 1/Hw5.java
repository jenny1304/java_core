import java.util.Scanner;

public class Hw5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.err.println("Enter value:");
		Double A = input.nextDouble();

		if (A%2==0){
		System.err.println("Result: EVEN NUMBER");
		}

		else{
		System.err.println("Result: ODD NUMBER");
		}	
	}
}