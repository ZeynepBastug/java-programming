package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 60;

        System.out.println("Class is going on for " + minutes + " minutes");

        if (minutes > 50) {
            throw new BreakTimeExceptions("It's break time!");
        }

        System.out.println("Let's continue the class");


        double balance = 400;
        double itemPrice = 500;

        if (itemPrice > balance) {

            throw new InsufficientBalanceException("Transaction declined. Not enough funds");
        }
        System.out.println("Item successfully purchased");
    }
}
