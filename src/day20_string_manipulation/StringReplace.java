package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        // REPLACE() method in String class:
        // it searches in the string and replaces with another string.
        // String word = "java";
        // word.replace("a", "u") -> "juvu"

        String sentence = "Java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence.replace("strings","conditions"));
        System.out.println(sentence.replace("Java",""));
    }
}
