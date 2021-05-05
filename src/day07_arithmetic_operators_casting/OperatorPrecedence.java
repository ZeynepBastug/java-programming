package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main (String[] args){
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3); //12
        System.out.println(10 - 5 + 3); //8
        System.out.println(10 - (5 + 3)); //2

        System.out.println(3 * 2);
        System.out.println(3 * 2 / 3);
        System.out.println(20 / (2 * 2));
        // System.out.println(20 / 0); -> Cannot divide by ZERO. Error while code running

        System.out.println(2 + 5 * 3); //17
        System.out.println((2 + 5) * 3); //21

        System.out.println(10 / 3); //3
        System.out.println(5 / 2); //2
        // INTEGER DIVISION PROBLEM
        // When you divide 2 whole numbers, result is ALWAYS whole number.
        // it doesn't add any decimals, it will get rid of any remaining value.
        // If you need mathematical precision, NEVER divide integers/whole numbers.

        // Use decimal points number double or float.


    }

}
