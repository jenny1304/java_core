package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class file {
    public static ArrayList<String> phoneList = new ArrayList<>();
    public static ArrayList<String> searchResult = new ArrayList<>();

    public static void checkPhone(ArrayList<String> numberPhone, String search) {
        Pattern pattern = Pattern.compile("^" + search);
        for (int i = 0; i < numberPhone.size(); i++) {
            Matcher matcher = pattern.matcher(numberPhone.get(i));
            if (matcher.find()) {
                searchResult.add(numberPhone.get(i));
            }
        }
    }

    public static void getPhoneFromTxt() {
        try {
            FileReader reader = new FileReader("C:\\Users\\Le Thanh\\Desktop\\src\\File\\phone.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String phone = "";

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        phone = phone + line.charAt(i);
                    } else {
                        phoneList.add(phone);
                        phone = "";
                    }
                }

            }

            reader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void display() {
        for (int i = 0; i < searchResult.size(); i++) {
            System.out.println(searchResult.get(i));
        }
    }

    public static void search() {
        System.err.print("Enter number to find: ");
        Scanner search = new Scanner(System.in);
        String number = search.nextLine();
        getPhoneFromTxt();
        checkPhone(phoneList, number);
        System.err.println("Found the following results: ");
        display();
    }

    public static void add() {
        System.err.println("Enter number to add: ");
        Scanner add = new Scanner(System.in);
        String number = add.nextLine();
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Le Thanh\\Desktop\\src\\File\\phone.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(" " + number);
            System.err.println("Number added!");

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        // Tim kiem so dien thoai
        // Them so dien thoai

        boolean on = true;

        while (on) {
            System.out.println("1. Search");
            System.out.println("2. Add");
            System.out.println("0. Exit");
            Scanner input = new Scanner(System.in);
            int options = input.nextInt();
            switch (options) {
                case 1:
                    search();
                    break;

                case 2:
                    add();
                    break;
                case 0:
                    System.err.println("Thankyou!");
                    on = false;
                    break;
                default:

                    break;
            }
        }

    }
}