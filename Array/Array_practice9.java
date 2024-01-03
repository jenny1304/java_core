package Array;

public class Array_practice9 {
    public static void main(String[] args) {
        int Array[] = { 43, 78, 23, 45 };
        int newNumbers[] = new int[4];
        int result;
        for (int i = 0; i < Array.length; i++) {
            result = Array[i] * 10;
            newNumbers[i] = result;
        }
        System.err.println(newNumbers[0]);
        System.err.println(newNumbers[1]);
        System.err.println(newNumbers[2]);
        System.err.println(newNumbers[3]);
    }
}
