package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println( speedLimit < currentSpeed);
        System.out.println(currentSpeed < speedLimit );
        System.out.println(currentSpeed == speedLimit );

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding?  " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");


        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford it? - " + (accountBalance > itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);

        //decrease balance by itemPrice. using shorthand operators.

        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke = " + isBroke);










    }
}
