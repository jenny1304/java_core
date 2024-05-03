import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT3_1 {
    public static boolean checkPass(String password) {
        if (password.length() < 8) {
            return false;
        }

        Pattern letter = Pattern.compile("[a-zA-Z]");
        Matcher matcherLetter = letter.matcher(password);

        if (!matcherLetter.find()) {
            return false;
        }

        Pattern number = Pattern.compile("[0-9]");
        Matcher matcherNumber = number.matcher(password);

        if (!matcherNumber.find()) {
            return false;
        }

        Pattern special = Pattern.compile("[`!@#$%^&*()_+]");
        Matcher matcherSpecial = special.matcher(password);

        if (!matcherSpecial.find()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();

        System.out.println(checkPass(password));
        input.close();
    }
}
