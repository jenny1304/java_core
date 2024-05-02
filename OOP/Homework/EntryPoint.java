package OOP.Homework;

public class EntryPoint {

    public static void main(String[] args) {
        point p1 = new point(1.5, 6.7);
        point p2 = new point(2.8, 3.2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2.34, 7.8));
    }
}
