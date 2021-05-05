package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 90;
        String result1;
        if (score1 > 60) {
            result1 = "Pass";
        } else {
            result1 = "Fail";
        }
        System.out.println("result1 = " + result1);

        // WITH TERNARY

        int score = 88;
        String result = (score > 60) ? "pass" : "Fail";
        System.out.println("result = " + result);

        String quality = "bad";
        System.out.println(quality.equals("good") ? 100 : 0);
        long rating = quality.equals("good") ? 100 : 0;
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        int score_ = 150;
        boolean evenOdd = (score_ % 2 == 0) ? true : false;

        // TERNARY OPERATOR ? can e used for short conditions where you assign one value or another based on condition.

        // int num1 = 10;
        // int num2 = 30;
        // int max = num1 > num2 ? num1 : num2;
        // print max; --> 30

        // if(max > 5) {
        //     System.out.println("more than 5");
        // } else {
        //     System.out.println("NOT more than 5");
        // }

        // ADVANTAGES:
        //   - One statement to replace basic if else statement
        //   - if else is more than flexible when you have multi branch conditions.
        // =======================================

        // if(price > 100) {
        //      itemName = "Wooden spoon";
        //      payment = "cash";
        // }

        // Ternary cannot handle the above statement.
        // It has limitation to be able to return a single value.
        // ======================================





    }
}
