package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading.sum(10,5);
        sum(10.4,5.5);
        sum(4, 1, 2);
        sum("Hello", "World");



    }

    public static void sum(int num1, int num2){
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));

    }
    public static void sum(double num1, double num2){
        System.out.println("sum(double num1, double num2)");
        System.out.println("Result = " + (num1 + num2));

    }
    public static void sum(int num1, int num2, int num3){
        System.out.println("sum(int num1, int num2, int num3)");
        System.out.println("Result = " + (num1 + num2 + num3));

    }
    public static void sum(String word1, String word2){
        System.out.println("sum(String word1, String word2)");
        System.out.println("Result = " + (word1 + word2));

    }




}
