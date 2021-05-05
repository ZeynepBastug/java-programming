package day21_string_manipulatioon;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char third = word.charAt(1);

        if (first == third) {
            System.out.println("first and last letter matched");

        } else {
            System.out.println("first and last letter mismatched");
        }

        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() - 1);
        // int count = friend.length();
        // char LastLetter = friend.charAt(count -1);   -> Same result more steps!

        System.out.println("first letter: " + firstLetter);
        System.out.println("last letter: " + lastLetter);
        if (firstLetter == lastLetter) {
            System.out.println(friend + " - first and last letter match");
        } else {
            System.out.println((friend + " - first and last letter mismatch"));
        }

    }
}
