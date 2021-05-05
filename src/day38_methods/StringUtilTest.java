package day38_methods;

import static day38_methods.StringUtils.*;
/**
 * import all static methods, so that you can just call by method name, without classname
 */

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL! User name can't be empty or null");
        }

        String str = "civic";
        System.out.println("isPalindrome(str) = " + StringUtils.isPalindrome(str));
        str = "kayak";
        System.out.println("isPalindrome(str) = " + isPalindrome(str));
        str = "cybertek";
        System.out.println("isPalindrome(str) = " + isPalindrome(str));

        String word = "java";
        String revWord = StringUtils.reversed(word);
        System.out.println("Word = " + word);
        System.out.println("Reverse = " + revWord);

        word = "pyhton";
        System.out.println("Word = " + word);
        System.out.println("Reverse = " + reversed(word));
    }

}
