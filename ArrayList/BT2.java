import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT2 {
    public static ArrayList<String> res = new ArrayList<>();

    public static void checkPhone(String numberPhone[], String search) {
        Pattern pattern = Pattern.compile("^" + search);
        for (int i = 0; i < numberPhone.length; i++) {
            Matcher matcher = pattern.matcher(numberPhone[i]);
            if (matcher.find()) {
                res.add(numberPhone[i]);
            }
        }
    }

    public static void main(String[] args) {
        String numberPhone[] = { "0987654321", "0363457289", "0363472798", "0997778779", "0270997737", "0899933229",
                "0922270122", "0999922233", "0989992222" };

        Scanner input = new Scanner(System.in);

        String search = input.nextLine();

        checkPhone(numberPhone, search);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        input.close();
    }
}
