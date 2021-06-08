package day22_string_manipulation;

import java.lang.*;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        // String manipulation methods:
        // - equals() -> checks if value equals to another string. Case sensitive
        // - equalsIgnoreCase() -> checks if value equals another string, case insensitive
        // - length() -> returns count of characters in string
        // - toUpperCase() -> converts all letters to uppercase
        // - toLowerCase() -> converts all letters to lower case
        // - startsWith() -> checks if string value starts with another string returns boolean
        // - endsWith() -> checks if string value ends with another string and returns boolean
        // - contains() -> checks if string is present another anywhere in string value. returns boolean
        // - isEmpty() -> checks if string is empty/no characters "", returns boolean
        // - replace() -> searches for a string and replaces all occurrences in string value

        // - index in String -> is position of characters in the string. starts with 0. Zero based. Each character in
        // string value has a position or index.
        // - charAt(index number) -> reads a character at given index and returns that character
        // - indexOf() -> searches for a string and returns index numbers. If no found returns -1
        // - substring() -> reads one portion of the string from beginning index to ending index.

        String word = "java";
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));

        String reversed = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word2 = " + reversed);
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("palindrome word");
        }else {
            System.out.println("not palindrome word");
        }


    }
}
