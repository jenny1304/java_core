package OOP.Interface;

import java.util.List;

public class ShapeUtil {
    public String printInfo(List<GeometricObject> shapes) {
        String result = "Circle:\n";
        // Cach 1: Co index, get theo index
        for (int i = 0; i < shapes.size(); i++) {
            // result = result + shapes.get(i).getInfo() + "\n";
            if (shapes.get(i) instanceof Circle) {
                result += shapes.get(i).getInfo() + "\n";
            }
        }
        result += "Triangle:\n";

        for (int i = 0; i < shapes.size(); i++) {
            // result = result + shapes.get(i).getInfo() + "\n";
            if (shapes.get(i) instanceof Triangle) {
                result += shapes.get(i).getInfo() + "\n";
            }
        }

        // Cach 2: Khong can index, get lan luot
        // for (GeometricObject shape : shapes) {
        // result += shape.getInfo() + "\n";
        // }

        return result;
    }
}
