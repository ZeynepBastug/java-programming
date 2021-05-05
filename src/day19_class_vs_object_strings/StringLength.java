package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        // LENGTH OF THE STRING:
        // length() method in String class. Returns the count of characters in the string.

        String word = "java";
        System.out.println(word);
        System.out.println(word.length());   // 4
        System.out.println("count: " + word.length());

        String name = "Nadir";
        System.out.println(name.length());   // 5

        System.out.println("Wooden spoon".length());

        int count = name.length();
        System.out.println("count = " + count);

        String password = "abc123";
        /** IF STATEMENT:
         *  WHEN  password is at least 6 characters
         *  print: valid amazon password
         *  ELSE
         *  print: password too short
         */
        if(password.length() >= 6) {
            System.out.println("Valid Amazon password");
        }else{
            System.out.println("Password must be at least 6 characters.");
        }
        // SO FAR, String manipulation methods:

        // - equals()
        // - equalsIgnoreCase()
        // - toUpperCase()
        // - toLowerCase()
        // - length()
        // - startsWith()
        // - endsWith()
        // - contains()





    }
}
