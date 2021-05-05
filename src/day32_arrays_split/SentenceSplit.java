package day32_arrays_split;

import java.util.*;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("First word: " + words[0]);
        System.out.println("Second word: " + words[1]);
        System.out.println("Third word: " + words[2] );
        System.out.println(Arrays.toString(words));

        for(String w : words){
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] result = googleResult.split(" ");

        System.out.println("seconds: " + result[3].replace("(", ""));

        for(String word : result ){
            if(word.equals("1,810,000")){
                System.out.println(word);
            }
        }

    }
}
