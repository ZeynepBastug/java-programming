package day08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = scan.next();
        System.out.println("nice to meet you, " + firstName);



        //  STEPS TO USE SCANNER CLASS:
        //  1) Type on top of class: we need import Scanner class into our class.
        //     import java.util.Scanner;
        //  2) Create Scanner Object using NEW keyword.
        //     Scanner scan = new Scanner(System.in);
        //  3) Ask a question
        //     System.out.println("Please enter your name");
        //  4) Capture the typed keyboard input value into variable
        //     String firstName = scan.next();
        //

    }
}
