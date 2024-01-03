import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int AB = input.nextInt();
        int AC = input.nextInt();

        double BC = Math.sqrt(AC * AC - AB * AB);

        double S = 0.5 * AB * BC;

        System.err.println(S);
    }
}
