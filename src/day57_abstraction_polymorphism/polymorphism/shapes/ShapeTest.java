package day57_abstraction_polymorphism.polymorphism.shapes;

import sun.font.TextLabel;

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
        listOfShape.add(triangle);
        listOfShape.add(new Triangle());
        listOfShape.add(new Circle());
        listOfShape.add(square);
        listOfShape.add(circle);
        listOfShape.add(new Square());

        System.out.println(listOfShape); // prints Hashcodes of shapes

        for(Shape each : listOfShape){
            each.draw();
        }

        drawShape(new Circle());


    }

    public static void drawShape(Circle shape){
        System.out.println("drawing shape");
        shape.draw();
    }

    public static void drawShape(Square shape){
        System.out.println("drawing shape");
        shape.draw();
    }
}
