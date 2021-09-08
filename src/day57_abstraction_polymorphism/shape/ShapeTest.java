package day57_abstraction_polymorphism.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> listOfShape = new ArrayList<>();
        listOfShape.add(new Triangle());
        listOfShape.add(new Circle());
        listOfShape.add(new Square());

        for (Shape each : listOfShape) {
            each.draw();

        }
    }
}
