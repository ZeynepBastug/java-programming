package Repl;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // PROBLEM 2

        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // PROBLEM 3

        int num1 = 10;
        int num2 = num1++ * 3 + ++num1 + num1++ %2; //41
        int big = num1 > num2 ? num1 : num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("big = " + big);

        // PROBLEM 4
        char z = 90;
        char h = 104;
        char a_ = 65;

        System.out.println(a_ + " is an uppercase");
        System.out.println(h + " is a lowercase");
        System.out.println(z + " is an uppercase");




        // PROBLEM 1

        System.out.println("How many people are you living with?");
        int houseHold = scan.nextInt();

        scan.nextLine();

        if (houseHold <= 2) {
            System.out.println("Live with less than 2 people");
        }else if (houseHold >= 3 && houseHold < 6) {
            System.out.println("Live with less than 3 - 6 people");
        } else if (houseHold >=6) {
            System.out.println("live with more than 6 people");
        }

        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        System.out.println("Do you live in Downtown?");
        String downTown = scan.nextLine();

        if (downTown.equals("yes")){
            System.out.println("Have you ever thought about moving to the suburbs?");
            String suburb = scan.nextLine();
            if(suburb.equals("yes")){
                System.out.println("Do it, it's great");
            }else if(suburb.equals("no")){
                System.out.println("You should think about it.");
            }

        }
        System.out.println("What is your favorite animal?");
        String animal = scan.nextLine();
        System.out.println("Wow " + animal + " is a great animal");
        System.out.println("How many pets you want?");
        scan.nextLine();
        int pets = scan.nextInt();

        System.out.println("Interesting, do you want " + pets + " " + animal);





    }
}
