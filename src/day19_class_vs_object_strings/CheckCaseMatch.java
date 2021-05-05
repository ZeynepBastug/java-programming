package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        // You have a string country = "USA", how to check if all letters are uppercase?
        // UK, UAE, KG

        String countryCode = "KG";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail - case is incorrect");
        }

        String word = "Java";
        String uWord = word.toUpperCase();

        System.out.println(word);
        System.out.println(uWord);

        if(word.equals(uWord)){
            System.out.println("case match");
        }else {
            System.out.println("case mismatch");
        }

        // Can we make uppercase only first character?
        // Not with single method. in Java, String does not have a capitalize method. Other languages have it.



    }
}
