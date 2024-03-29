package OfficeHours.Practice_05_10_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SeperateParts {
    public static void main(String[] args) {
        // Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
        //
        //Ex: str = "ABCD123$%#@&456EFG!"
        //list1: {$, %, #, @, &, !}
        //list2: {A, B, C, D, E, F, G}
        //list3: {1, 2, 3, 4, 5, 6}
        //
        //Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the other ArrayLists
        //Challenge 2: do the original task again, but without a loop. Use lambda

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isLetter(eachChar)){
                letters.add(eachChar);
            } else if (Character.isDigit(eachChar)){
                digits.add(eachChar);
            } else {
                specials.add(eachChar);
            }

        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specials);








    }
}
