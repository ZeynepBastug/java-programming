package Repl;

import java. util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the time: ");
        int hours = scan.nextInt();

        String result = (hours < 0 || hours > 24) ? "invalid input" : "";
        System.out.println(result);


        String display = (hours >=0 && hours < 12) ? "Morning" : "Night";
        System.out.println(hours + " is " + display );



    }
}
