package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price");
        double price = scan.nextDouble();

        if (price >= 25.0) {
            System.out.println("FREE SHIPPING ELIGIBLE. YOUR TOTAL IS $" + price);
        } else {
            System.out.println("NOT ELIGIBLE FREE SHIPPING. YOUR ORDER IS $" + price + " LESS THAN $25.0");
        }


    }
}
