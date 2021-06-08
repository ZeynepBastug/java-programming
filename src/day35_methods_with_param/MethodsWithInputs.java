package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        // METHOD WITH PARAMETERS/INPUTS:
        // When you want your methods to be flexible and more reusable, we can add input/parameter variables.
        // public static void method(int n) {
        //      code
        // }
        // in above method 1, it accepts single int number
        // so when we call the method, we need to provide a number
        // HOW:
        // method1(); ERROR -> it is expecting an int number
        // public static void method1(int n) {
        //      code
        // }

        displayValue(1);
        displayValue(96);

        greetByName("Zeynep");
    }
        public static void displayValue(int num) {

            System.out.println("value is " + num);
        }

        public static void greetByName(String name){
            System.out.println("Hello " + name);

        }

}
