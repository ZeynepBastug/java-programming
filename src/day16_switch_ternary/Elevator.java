package day16_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Elevator {
    public static void main(String[] args) {

        // SWITCH STATEMENT:
        // In java and other languages, there is switch conditional statement. When we compare a variable to multiple values.

        // it is similar to MULTI-BRANCH if statement, but more compact, and more organized code
        // int n = 1;
        // if(n == 1) {
        //      System.out.println("n is 1");
        // } else if ( n == 2) {
        //      System.out.println("n is 2");
        // } else if ( n == 3) {
        //      System.out.println("n is 3");
        // } else {
        //      System.out.println("n is not 1, 2, 3");

        // Same exact code can be re-written using switch statement.
        // int n = 2;

        // switch(n) {
        //       case 1:
        //           System.out.println("n is 1");
        //           break;
        //       case 2:
        //           System.out.println("n is 2");
        //           break;
        //       case 3:
        //           System.out.println("n is 3");
        //           break;
        //       default:
        //           System.out.println("n is not 1, 2, 3");
        // }

        int floorNum = 1;

        System.out.println("==========IF STATEMENT VERSION==========");

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake House");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }

        System.out.println("==========SWITCH STATEMENT VERSION==========");

        floorNum = 2;

        switch (floorNum){
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake House");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
        }

        // SWITCH STATEMENT can be used to compare variable if it EQUALS several values. Switch can ONLY do == comparison.
        // Cannot do <, >, <=, >=, ==, != types of comparisons.

        // Switch has limitation in that sense.

        // BENEFITS:
        //    -> more readable, compact code
        //    -> easier to maintain
        //    -> might be faster than if else if statements. Since it jumps to matching case right away.


        // reports -> 70 - 100 types of reports
        // switch(reportName) {
        //      case "CR10":
        //            100 lines of code
        //            break;
        //      case "CR75":
        //            120 lines of code
        //            break;
        //  }

        // String browser = "chrome":
        // switch(browser) {
        //      case "chrome":
        //            code that opens chrome browser
        //            break;
        //      case "firefox":
        //            code that opens firefox browser
        //            break;
        //      case "safari":
        //            code that opens safari browser -> RUN, DON'T LOOK BACK
        //            break;
        //      case "edge":
        //            code that opens edge browser -> See first before RUNNING AWAY
        //            break ;







    }
}
