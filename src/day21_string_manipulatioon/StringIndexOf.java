package day21_string_manipulatioon;

public class StringIndexOf {
    public static void main(String[] args) {
        // indexOf() String method
        // it searches for a string and returns the index position number.
        // EX:
        //    String word= "java";
        //    System.out.println(word.indexOf("j"));   -> 0

        /**            012345 */
        String word = "github";
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("hub")); //it'll give the ONLY first letter's number
        System.out.println(word.indexOf("java"));
        System.out.println(word.indexOf("zeynep"));
    }
}
