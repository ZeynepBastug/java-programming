package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        // substring() String class method
        // returns part of the string.
        // 2 ways of using substring()
        // 1) substring(start, end) -> returns part of string from start index until end index. End index is not included.
        // remember indexes starts from zero.
        // 2) substring(start) -> returns part of string from start index until the last character.

        String word = "hello";
        System.out.println(word.substring(0, 2));
        System.out.println(word.substring(1,4));
        System.out.println(word.substring(2,4));

        String word2 = "java is fun";
        System.out.println(word2.substring(0, 4));
        System.out.println(word2.substring(5,7));
        System.out.println(word2.substring(8, 11));

        System.out.println(word2.substring(8));
        System.out.println(word2.substring(1));

    }
}
