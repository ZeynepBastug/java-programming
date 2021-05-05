package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        // String word = "ice cream";
        // word.length();
        // beginning index of string characters is always 0.
        // last index of the string i can find using length() method/function of String class.

        // FOR LOOP to start from 0 till length(last index)

         String word = "java";
        for(int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        /**
         * long way without loop
        String word = "java";
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
         */

        for(int i = word.length() - 1; i >= 0; i--){
            System.out.println(word.charAt(i));
        }



    }
}
