package day10_shorthand_operators;

import java.util.Scanner;
// There is small BUG/GLITCH with nextLine() :

// System.out.println("Enter name");
// Double rent = scan.nextDouble();
// String month = Scan.nextLine();

// System.out.println(rent);
// System.out.println(month);

// Enter values:
// 2500
// March

// OUTPUT:
// 2500

//Issue above is if we use nextLine() right after nextInt, nextDouble, nextBoolean etc. it will take that new
// line character/enter to and will ignore our string.

// It'll take \n -> new line character and ignore the text.

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your rent and month");
        double rent = scan.nextDouble();
        scan.nextLine(); //TO FIX THE BUG. Whenever you use nextLine after nextInt, nextDouble etc. Please add additional scan.nextLine() on top:
        String month = scan.nextLine();
        System.out.println("rent: " + rent);

        System.out.println("month: " + month);

        // How to update variable value.

        // int count = 10;
        // count = 15;

        // increase value of count by 5.

        // int count = 10;
        // count = count + 5;

        // double rent = 1250;
        // rent = rent + 50;
        // println(rent); -> 550

        // double fuelPrice = 2.75;

        // fuelPrice = fuelPrice - 1.0;

        //print(fuelPrice); -> 1.75






    }
}
