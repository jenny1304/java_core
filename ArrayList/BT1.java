import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Cach 1:
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        line = line.replaceAll("\s+", " ");
        System.err.println(line);

        input.close();

    }
}
