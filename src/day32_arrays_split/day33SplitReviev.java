package day32_arrays_split;

import java.util.*;

public class day33SplitReviev {
    public static void main(String[] args) {

        // Split method in java, is more powerful than we used so far.
        // It accepts REGULAR EXPRESSION as well
        // REGULAR EXPRESSION (RegEx) -> is a pattern matching technique.
        // EX:
        // \d -> any number
        // [A-Z] -> any character from A to Z
        // ....
        String word = "java1sql2html";
        String[] strArr = word.split("\\d");
        System.out.println(Arrays.toString(strArr));


        // it's not common to asked in job interview but in career you need it
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")){
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }

    }
}
