package String;

import java.util.Scanner;

// length()
// charAt() - lấy phần tử
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int flag = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '@') {
                flag = 1;
                System.err.println("yes");
                break;
            }
        }

        if (flag == 0) {
            System.err.println("no");
        }
    }
}
