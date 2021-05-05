package day37_methods_overloading;

import java.util.*;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));

        for (int i = 1; i <= 9; i++) {
            System.out.println(getDayName(i));
        }
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if (someDay == null ) {
            System.out.println("someDay is null for invalid day");
        }

        // LOGGERS in real project are more common than PRINTLN
        // LOGGERS -> prints into console also writes into a log/text file
        // PRINTLN is useful in automation/coding to be able to see the value quickly

        System.out.println(getDayNameV2(2));

    }
    public static String getDayName(int day){
        switch (day){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("ERROR: Invalid day - " + day);
                return null;

        }
        // When using switch statement inside the method, we cannot use return and break in same case.
        // Reason is it wil show Unreachable code error.
        // Return "value" -> means return the value also exit the method
        // break; -> exit switch statement only
        // null -> no object, NOTHING
        // String word = null;
        // word is null, no String object, no value, nothing
        // just an empty container
        // nul is not same as "" (empty double quotes)
        // "" -> is a value String object that has no characters
        // String word = null; -> no object, no value
        // String word2 = ""; -> valid String object/value
        // not the same
        // String word = null;
        // word.toUpperCase() -> ERROR: nullpointerException
    }

    public static String getDayNameV2(int day){
        String dayName;
        switch (day) {


            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;
    }
}
