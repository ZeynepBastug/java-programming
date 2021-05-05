package day16_switch_ternary;

public class TernaryIntro {
    public static void main(String[] args) {

        // TERNARY OPERATORS:
        // ? -> This operator can be used for simple if else conditions.

        // EXAMPLE:
        // String result;
        // int score = 90;
        // if(score > 60) {
        //      result = "Pass";
        // } else {
        //      result = "Fail";
        // }

        int score = 90;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);


        //================================================

        // boolean isGreen = true;
        // String action;
        // if(isGreen) {
        //        action = "Drive";
        // } else{
        //        action = "Stop";
        // }

        // boolean isGreen = true;
        // String action = (isGreen) ? "Drive" : "Stop";

    }

}
