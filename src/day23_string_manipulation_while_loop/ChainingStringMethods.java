package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        // CHAINING STRING METHOD:
        String word = "hello world";
        System.out.println(word.toUpperCase().replace(" ","_"));

        String city = "wATERLOO";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1,8).toLowerCase());

        // Split method is also important! we will study with Array topic.
        // In String class, we can chain some of the methods, it'll run from left to right.

        // .isEmpty().toUpperCase() does not work since isEmpty is boolean



    }
}
