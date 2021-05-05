package day18_conditional_practice_string_intro;

// Multiple of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers
// which are multiple of both three and five print "FizzBuzz"

/**
 * "FizzBuzz" -> when number is divisible by 3 and (&&) 5
 * "Fizz" -> When number is divisible by 3
 * "Buzz" -> When number is divisible by 5
 */


// SHORTHAND : Command + shift + F -> opens universal search in project
//             Command + shift + R -> opens Universal search and replace in project
public class FizzBuzz {
    public static void main(String[] args) {
        int num = 20;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");

        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }





    }
}
