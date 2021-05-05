package day32_arrays_split;

import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {


        String sentence = "today is java array class";
        String reverse = "";

        String[] words = sentence.split(" ");
        // print words array in reverse order
        for(int i = words.length -1; i >= 0; i--){
            // System.out.print(words[i] + " ");
            reverse += words[i] + " ";
        }

        System.out.println("sentence: " + sentence);
        System.out.println("reversed: " + reverse.trim());

        // USING SPLIT FOR EACH CHARACTER:
        // In below examples, we are splitting "java" into separate letter in array.
        // String word = "java";
        // String[] letter = word.split("");
        // the above will split by each character:
        //     letters -> {"j", "a", "v", "a"}
        // String word = "java";
        // char[] letters = word.toCharArray();
        //     letters -> {'j', 'a', 'v', 'a'}

    }
}
