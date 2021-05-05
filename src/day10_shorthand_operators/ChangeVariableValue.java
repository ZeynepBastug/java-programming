package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
        // add/ increase count by 2
        count = count + 2;
        System.out.println("count = " + count);

        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);

        int cents = 244;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("cents = " + cents);



    }
}
