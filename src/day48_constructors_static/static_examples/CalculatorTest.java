package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5, 3); // add is static method, can be called using ClassName.staticMethodName

        // Calculator.multiply(5, 3); // ERROR: cannot be used unless you have static method
        Calculator calculator = new Calculator();
        calculator.multiply(5, 3);

        calculator.add(5,3); // static method can also be called using an object

    }
}
