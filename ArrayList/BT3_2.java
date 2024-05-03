
import java.util.Scanner;

public class BT3_2 {
    public static boolean checkPass() {
        return true;
    }

    public static boolean checkPass(String password) {
        int countLetter = 0;
        int countNumber = 0;
        int countSpecial = 0;
        for (int i = 0; i < password.length(); i++) {
            int ascii = (int) password.charAt(i);
            if ((ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122)) {
                countLetter++;
            }
            if ((ascii >= 48 && ascii <= 57)) {
                countNumber++;
            }
            if ((ascii >= 32 && ascii <= 47)) {
                countSpecial++;
            }
        }
        if (!(countLetter != 0 && countNumber != 0 && countSpecial != 0)) {
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
