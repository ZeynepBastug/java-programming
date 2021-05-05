package OfficeHours.Practice_03_03_21;

public class Stage1_Calculator {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 10;

        double num3 = num1 + num2;
        double num4 = num1 - num2;
        double num5 = num2 - num1;
        double num6 = num1 * num2;
        double num7 = num2 / num1;

        System.out.println("Ex: If nums are 5 and 10 \n \t" + num1 + " + " + num2 + " = " + num3 + "\n \t" + num1 + " - "
        + num2 + " = " + num4 + "\n \t" + num2 + " - " + num1 + " = " + num5 + "\n \t" + num1 + " x " + num2 + " = " + num6
        + "\n \t" + num2 + " / " + num1 + " = " + num7);
    }
}
