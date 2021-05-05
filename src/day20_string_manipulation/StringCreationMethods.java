package day20_string_manipulation;

// import java.lang.*;  // import all classes from java.lang package
// When you have import and it is grey color, it means it is a unused import. Means: you imported but never used any
// class that comes from that import.
// make sure to not to have UNUSED import in yor class before you submit your code for review.

import java.util.*;

public class StringCreationMethods {
    public static void main(String[] args) {
        String word1 = "imac";
        String word2 = new String("macbook");
        String word3 = "";
        String word4 = new String();
        System.out.println("Hello Word");


        // String manipulation methods
        // String is a class. From String class we create objects:
        // String class -> String object
        //              -> String object etc.

        // Scanner -> import java.util.Scanner;
        // String  -> AUTO import java.util.Scanner;

        // Scanner import:
        //         -> import java.util.Scanner;
        //         -> import java.util.*;
        //         -> import all classes from java.util. package
        // * - means everything.
        // When we use .*, it does not mean that all imported classes are loaded to our program. Only the ones that we
        // actually use are loaded to our program.

        // String - it is a class, but we never had to import it.
        // System.out.println();
        // System is also a class, but we never had to import it.
        // Why?
        // Answer: They are automatically imported by compiler.
        // Each class that we have been writing so far, compiler automatically added below import statement.

        /**
         * package day01_intro;
         *
         * import java.lang.*;  -> automatically imported by compiler to each class, we don't need to type it.
         *
         * public class HelloWorld {
         *     public static void main(String[] args) {
         *         System.out.println("Hello World");
         *     }
         * }
         */


    }

}
