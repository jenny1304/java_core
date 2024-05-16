package OOP.Project1;

import java.util.Scanner;

public class DictionaryManagement extends Dictionary {

    public void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        int wordsAmount = input.nextInt();

        input.nextLine();
        for (int i = 0; i < wordsAmount; i++) {
            String wordTarget = input.nextLine();
            String wordExplain = input.nextLine();
            Word word = new Word(wordTarget, wordExplain);
            dictionary.add(word);
        }

        for (int i = 0; i < dictionary.size(); i++) {
            System.out.println(dictionary.get(i).getWord_target() + " | " + dictionary.get(i).getWord_explain());
        }

        input.close();
    }

    public static void main(String[] args) {
        DictionaryManagement obj = new DictionaryManagement();
        obj.insertFromCommandline();
    }
}
