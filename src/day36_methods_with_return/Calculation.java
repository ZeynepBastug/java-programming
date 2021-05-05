package day36_methods_with_return;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("10 + 45 = " + Calculator.add(10, 45));
        System.out.println("20 x 12 = " + Calculator.multiple(20,12));

        double d1 = 234;
        double d2 = 127;
        System.out.println(Calculator.minus(d1,d2));
    }
}
