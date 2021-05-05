package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        // In java programming, our methods mostly return a value.
        // METHOD WITH RETURN:
        //   1. WITHOUT PARAMETERS:
        //      public static in getCreditScore() {
        //          return 800;
        //      }
        // when we have a return value: we specify return type right before method name.
        // public -> visible to everyone
        // static -> do not need object to call the method
        // int -> return data type. this method will return whole number
        // getCreditScore -> method name and no params
        // return 800; -> whenever we return a value from a method (not void), you need to RETURN keyword inside your method


        checkEligible(690);
        checkEligible(750);
        System.out.println(getCreditScore());
        System.out.println("Score = " + getCreditScore());
    }


    public static void checkEligible (int score){
        if (score >= 700){
            System.out.println("You're eligible for leasing this car");
        } else {
            System.out.println("You're not eligible for leasing this car");
        }

    }


    public static int getCreditScore() {
        return 800;
    }


}
