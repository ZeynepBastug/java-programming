package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

        String str = "civic";
        System.out.println("isPalindrome(str) = " + isPalindrome(str));
        str = "kayak";
        System.out.println("isPalindrome(str) = " + isPalindrome(str));
        str = "cybertek";


    }

    public static boolean isNullOrEmpty(String str){
        // return (str == null || str.isEmpty());
        if(str == null || str.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static String reversed(String word){
        String strReversed = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
           strReversed +="" + word.charAt(i);
        }
        return strReversed;
    }

    // String word = null;
    // System.out.println(word.isEmpty());
    // Above line will throw NullPointerException, cus we are trying to run a string method on NO STRING/NULL
    // String word = null;
    // if ( word.isEmpty() || word == null ) { <-- NullPointerException
    // }




}
