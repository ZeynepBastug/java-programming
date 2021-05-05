package day09_scanner_practice;

import java.util.Scanner;
// 1) IMPORT SCANNER:
// java.util -> is a package name where Scanner class is located.
// import means, " I would like to use this class in my program, so import it.

public class AskAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 2) CREATE SCANNER OBJECT:
        //    Scanner scan -> declare a variable of data type Scanner
        //    Ex: String name;
        //    Scanner is non-primitive, object type, class type.
        //    Scanner is class name
        //    new -> Create new object from a class
        System.out.println("How old are you?");
        int age = scan.nextInt();

        // 3) USE SCANNER FUNCTION/METHOD TO ACCEPT INT FROM KEYBOARD
        //    nextInt -> accept int value (whole number) from keyboard/console
        // So we have been assigning values into variables in our java programs, like int n = 33;
        // Scanner can be used to enter different values when programming is running. we enter vallues to our variables
        // from keyboard, then that value will go into our variable.
        //    int n = 33; -> value 33 is already assigned to  variable
        // int n = scan.nextInt(); -> value will be assigned from console/ keyboard when progam is running.
        //    Ex:
        //    Enter number:
        //    44
        //
        //    44 will be assigned into n variable now.
        //    HARDCODING the value: assigning the value to a variable in your CODE.
        //    Not from scanner or any other source.

        System.out.println(age + "-that's a great age!");
        // Scanner class gives us a capability to pass values/inputs into our java program. Interactive way.
        // When we installed JDK/java, many ready classes came with it. For examples String, System, Scanner etc. We can
        // use them in our java programs.
        // In order to use them we need to import first.
        // We type import packageName.Classname;
        // import java.util.Scanner;

        // It means that you want to use that Class in your program.
        // Once imported, we need to create object from that class first.

        // Create scanner object
        // Scanner scan = new Scanner(System.in);
        // Scanner input = new Scanner(System.in);
        // Scanner keyboard = new Scanner(System.in);
        // Scanner in = new Scanner(System.in);

        // After object is created, now we can call/use its functions;

        // nextInt() -> used to input int value
        // nextByte() -> used to input byte value
        // nextShort() -> used to input short value

        // next() -> used to input string, single word, until space
        // nextLine() -> used to input whole sentence as String

        // nextChar() is not there.

        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();

        // line 105 -> is declare and create scanner object,
        // then 106, we are using that Object to input an int value.

    }
}
