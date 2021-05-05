package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourRate = scan.nextDouble();
        double weeklyPay = 40 * hourRate;
        double monthlyPay = weeklyPay * 53 / 12;
        double annualPay = monthlyPay *12;

        System.out.println("Weekly pay: $" + weeklyPay);
        System.out.println("Monthly pay: $ " + monthlyPay);
        System.out.println("Annual pay: $" + annualPay);

    }
}
