import java.util.Scanner;

public class ex1 {
    public int reverseNumber(int number) {
        // 347
        int reverse = 0;
        int count = 0;
        int number2 = number;
        while (number2 != 0) {
            number2 = number2 / 10;
            count++;
        }

        for (int i = 0; i < count; i++) {
            reverse = reverse + (int) ((number % 10) * Math.pow(10, count - 1));
            count--;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        ex1 obj = new ex1();
        System.out.println(obj.reverseNumber(number));

        input.close();
    }
}
