package day09_scanner_practice;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed?");
        int speedLimit = 55;
        int currentSpeed = scan.nextInt();
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + "mph over the limit. Slow down!" );

    }

}
