package Repl;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter day:");
        String day = scan.nextLine();
        String officeHours;

        switch(day){
            case "Monday": case "Tuesday": case "Wednesday":
                officeHours = "Office hours at 5:30 - 6:45 EST";
                break;
            case "Thursday":
                officeHours = "Soft Skills day";
                break;
            case "Friday":
                officeHours = "Day off";
                break;
            case "Saturday": case "Sunday":
                officeHours = "Already a long day, no office hours.";
                break;
            default:
                officeHours = "Invalid day given";

        }
        System.out.println(officeHours);

    }
}
