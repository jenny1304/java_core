package OOP;

import java.util.Scanner;

public class Lesson1 {
    void isPrime(int number) {
        int count = 0;
        if (number < 2) {
            System.err.println("Not a prime number");
            count++;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.err.println("Not a prime number");
                    count++;
                    break;
                }
            }
        }

        if (count == 0) {
            System.err.println("Is a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Lesson1 result = new Lesson1();
        result.isPrime(number);
    }
}
