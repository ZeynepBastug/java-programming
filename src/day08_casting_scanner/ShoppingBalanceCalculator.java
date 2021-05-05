package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args){
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = (balance - price1 - price2 - price3);
        System.out.println("Your initial balance is $" + balance);
        System.out.println("Your remaining balance is $" + remainingBalance);

        int balanceWithNoCents = (int)remainingBalance;
        System.out.println("Your Balance without cents is $" + balanceWithNoCents);

        // CASTING:
        // -> convert one primitive type into another
        // byte, short, int, long
        // float, double
        // char, boolean
        // When we assign one primitive data into different one, we need to convert it/cast it.
        // 2 types of CASTING:
        // # IMPLICIT CASTING ->
        // # EXPLICIT CASTING -> We need to use paranthesis and specify what primitive type we want to cast/convert.




    }

}
