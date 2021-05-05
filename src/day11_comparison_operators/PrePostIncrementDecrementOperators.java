package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        // PRE-INCREMENT: ++ is before the variable left.
        // If we look at it from left to right, it increase variable value first.

        int num1 = 10;
        // ++num1;
        // int num2 = num1;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int apples = 5;
        int basket = ++apples;
        System.out.println("basket = " + basket);
        System.out.println("apples = " + apples);


        // POST-INCREMENT: ++ is placed after the variable name.
        // As it runs from left to right, increase in value happens afterwards.

        int num3 = 4;
        int num4 = num3;
        num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5; //pre increment
        System.out.println(++cars);

        int sedans = 10;  //post decrement
        System.out.println(sedans++);
        System.out.println(sedans);
        
        
        // EXAMPLES
        
        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // We can use underscores when assigning numbers. Underscore _ needs to be in between numbers.
        // Cannot be in the beginning or at the end.
        // The purpose of this is that making to read easier for us.








        








    }
}
