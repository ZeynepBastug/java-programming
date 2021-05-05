package day19_class_vs_object_strings;
// STRING CASE CONVERSION METHODS:

// toLowerCase() -> converts all letters to lowercase
// toUpperCase() -> converts all letters to uppercase

// String word = "Java";
// System.out.println(word.toLowerCase());
// OUTPUT: java

public class StringCaseConversion {
    public static void main(String[] args){
        String word = "CyberTek";
        String sentence = "123 java is FUN!";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word);
        
        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);

        // JAVA METHOD: is a function/action/behaviour of the class.
        // toUpperCase() is String class METHOD that converts letter to all uppercase.

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        
        //Change company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);




    }
}
