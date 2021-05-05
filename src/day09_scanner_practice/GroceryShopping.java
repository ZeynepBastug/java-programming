package day09_scanner_practice;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price of milk:");
        double milk = scan.nextDouble();
        System.out.println("Enter price of bread:");
        double bread = scan.nextDouble();
        System.out.println("Enter price of cucumbers");
        double cucumbers = scan.nextDouble();

        double total = milk + bread + cucumbers;
        System.out.println("Total price: $" + total);



    }
}
