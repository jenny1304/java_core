package String;

public class Test {
    private static int data = 10;

    public static void change(int newData) {
        data = newData;
    }

    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main(String[] args) {
        // VD1: Truyen tham chieu
        System.out.println(data);
        change(100);
        System.out.println(data);

        // VD2: Truyen tham tri
        int x = 1;
        int y = 8;
        System.err.println(x + ", " + y);
        swap(x, y);
        System.err.println(x + ", " + y);
    }
}
