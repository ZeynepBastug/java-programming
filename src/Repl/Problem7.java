package Repl;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("What is your hourly rate?");
        double hourlyRate = scan.nextDouble();

        System.out.println("What is your weekly hours?");
        int weeklyHours = scan.nextInt();

        System.out.println("what is the number of weeks that you worked?");
        int numOfWeeks = scan.nextInt();

        if(hourlyRate <= 0) {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }else if (weeklyHours <= 0 || weeklyHours >= 65){
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        }else if (numOfWeeks < 1 || numOfWeeks > 52){
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        }

        double salary = hourlyRate * weeklyHours * numOfWeeks;
        System.out.println("Your salary is $" + salary);

    }
}
