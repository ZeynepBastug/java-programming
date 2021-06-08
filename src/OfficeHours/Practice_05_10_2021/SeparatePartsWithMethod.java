package OfficeHours.Practice_05_10_2021;

import java.util.*;

public class SeparatePartsWithMethod {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";


        System.out.println(separation(str));

    }





public static ArrayList<ArrayList<Character>> separation (String str ){
    ArrayList<ArrayList<Character>> all = new ArrayList<>();

    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> digits = new ArrayList<>();
    ArrayList<Character> specials = new ArrayList<>();

    all.add(letters);
    all.add(digits);
    all.add(specials);


    for (int i = 0; i< str.length(); i++) {
        char each = str.charAt(i);
        if (Character.isLetter(each)){
            all.get(0).add(each);
        } else if (Character.isDigit(each)){
            all.get(1).add(each);
        } else {
            all.get(2).add(each);
        }

    }

return all;
}
}
