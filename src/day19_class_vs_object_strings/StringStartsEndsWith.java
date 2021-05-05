package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        // STARTSWITH() Method:
        //      String startsWith() method, checks if string starts with certain string, and returns BOOLEAN (true/false)

        // String word1 = "selenium";
        // System.out.println(word1.startsWith("s"));       -> true
        // System.out.println(word1.startsWith("Selen"));   -> False

        // word = "java";
        // System.out.println(word.startsWith("ja"));    -> true
        // System.out.println(word.startsWith("av"));    -> false
        // System.out.println(word.startsWith("va"));    -> false

        String word = "intellij idea";
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("Int")); // cus it's case sensitive
        System.out.println(word.startsWith("idea"));

        String firstName = "Dr. Nadir";
        if(firstName.startsWith("Mr.")){
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")){
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr.")){
            System.out.println("Senior");
        } else {
            System.out.println("Normal name");
        }

        /**
         * String url = "https://stackoverflow.com
         * .com -> "Commercial website"
         * .ru -> "Russian website"
         * .gov -> "Government website"
         * .edu -> "Education website"
         * .org -> "Organization website"
         */

        String url = "https://www.rembler.ru";
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")){
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")){
            System.out.println("Organization website");
        }

    }
}
