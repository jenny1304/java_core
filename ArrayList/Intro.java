import java.util.ArrayList;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        String name2 = input.next();
        names.add(name1);
        names.add(name2);
        System.err.println("[" + names.get(0) + ", " + names.get(1) + "]");
    }
}
