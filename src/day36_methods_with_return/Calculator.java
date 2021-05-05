package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("SUM = " + add(5,20));
        System.out.println("SUBTRACT = " + minus(45, 12));
        System.out.println("MULTIPLICATION = " + multiple(12,67));

    }


    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2){
        double subtract = num1 - num2;
        return subtract;
    }

    public static int multiple(int num1, int num2){
        int multi = num1 * num2;
        return multi;
    }
}
