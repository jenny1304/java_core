package OOP.Interface;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(8, 4);
        Point point2 = new Point(1, 0);
        Point point3 = new Point(2, 0);
        Point point4 = new Point(10, 2);
        Circle circle1 = new Circle(point1, 2);
        Circle circle2 = new Circle(point4, 10);
        Triangle triangle1 = new Triangle(point1, point2, point3);

        // System.out.println(circle1.getInfo());
        // System.out.println(triangle1.getInfo());

        List<GeometricObject> shapes = new ArrayList<>();
        shapes.add(triangle1);
        shapes.add(circle1);
        shapes.add(circle2);

        ShapeUtil shapeUtil = new ShapeUtil();
        // System.out.println(shapeUtil.printInfo(shapes));
        System.out.println(triangle1.getPerimeter());
    }
}
