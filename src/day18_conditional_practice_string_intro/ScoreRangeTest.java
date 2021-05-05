package day18_conditional_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {

        // RangeChecks with numbers/chars

        // age:
        //     1 - 3 -> baby
        //     3 - 7 -> toddler
        //     7 - .......

        int score = 55;
        if (score >= 1 && score <= 40) {
            System.out.println("your score is D");
        } else if (score >= 41 && score <= 60) {
            System.out.println("your score is C");
        } else if (score >= 61 && score <= 90) {
            System.out.println("your score is B");
        } else if (score >= 91 && score <= 100) {
            System.out.println("your score is A");
        } else {
            System.out.println("invalid score = " + score);
        }

    }
}
