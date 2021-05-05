package day18_conditional_practice_string_intro;

public class IfWithoutCurlyBrace {
    public static void main(String[] args) {
        String todaysClass = "python";

        if (todaysClass.equals("java"))
            System.out.println("Java is fun");
        else
            System.out.println("it is not java. it is " + todaysClass);

        // sometimes we can skip using curly { } braces with if conditions.
        // WHEN:
        //      When we have ONLY 1 statement in IF block or ELSE block.
        //      If we have more than 1 statement (;) then we MUST use {} to work.
        // ADVICE:
        //      Always use curly braces, does not matter 1 or more statements. NO benefit of skipping { }

        // int a = 1;

        // if(a == 1){
        //      System.out.println("lowest score 1");
        // } else if (score == 2) {
        //      System.out.println("score is 2");
        // } else if (score == 3) {
        //      System.out.println("score is 3");
        // } else
        //      System.out.println("invalid score");
        // }

        // if(a == 1)
        //      System.out.println("lowest score 1");
        // else if (score == 2)
        //      System.out.println("score is 2");
        // else if (score == 3)
        //      System.out.println("score is 3");
        // else
        //      System.out.println("invalid score");

        // Above example both will work, because we have only 1 statement for each condition.
        // For below statement, we cannot use without curly  braces:

        // int score = 1;
        // if(score > 0) {
        //     System.out.println("pass");
        //     System.out.println("Your score is " + score);
        // } else {
        //     System.out.println("Fail");
        //     System.out.println("Your score is " + score);

        // ERROR BELOW:
        // int score = 1;
        // if(score > 0)
        //     System.out.println("Pass")
        //     System.out.println("your score is " + score);
        // else
        //     System.out.println("Fail")
        //     System.out.println("your score is " + score);

        // int a = 2;
        // if(a == 1)
        //     System.out.println("a is 1");
        //     System.out.println("1 is a");
        // OUTPUT: '1 is a'
        // in above example, only first print statement  is related to IF block. Second print statement is outside
        // if block and will always run

        // RULE: Always use curly braces, so you don't go wrong.

        int a = 1;
        if(a == 1)
            System.out.println("a is 1");
        System.out.println("1 is a");

        // Only single statement will be part of if block if we skip {}.
        // AGAIN! A l w a y s  u s e  c u r l y  b r a c e s

        // if(condition) return false;


    }
}
