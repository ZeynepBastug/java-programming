package day32_arrays_split;

import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        // SPLIT - String class method:
        // SPLIT - break into pieces/chunks in English
        // SPLIT - method in Java -> splits String into pieces in Array items, by using the delimiter.
        // String words = "java;python;ruby";
        // java
        // python
        // ruby

        // We can use split method and specify ';' as delimiter to split into array
        // words.split(";") -> result will be String[] with 3 values.
        //                      {"java", "python", "ruby"}

        // String words2 = "java is fun";
        // words2.split(" "); -> String[] {"java", "is", "fun"}

        // String words3 = "bengal cat tabby cat persian cat no cat here";
        // words3.split(" cat "); -> String[]{}

        String words = "java:python:ruby";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);


        for(String each : wordsArray) {
            System.out.println(each);
        }

        String sentence = "today I am coding java arrays";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println("first word: " + wordsInSentence[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);
        System.out.println("second word: " + wordsInSentence[1]);
        System.out.println("third word: " + wordsInSentence[2]);
        System.out.println("sentence length: " + wordsInSentence.length);



    }
}
