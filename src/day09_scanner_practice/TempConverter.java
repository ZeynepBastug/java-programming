package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---- FAHRENHEIT TO CELSIUS CONVERTER ----");
        System.out.println("Enter Fahrenheit value");
        double fah = input.nextDouble();
        double cel = (fah - 32) * 5 / 9;
        System.out.println(cel + ("C"));


    }
}
