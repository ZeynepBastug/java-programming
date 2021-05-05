package day12_conditional_statements;
//  CONDITIONAL STATEMENTS IN JAVA:
//  We use conditional statement in our daily lives. If it is running, get umbrella. If car gass is showing low,
//  go to gas station.
//  If John is hungry, he eats etc.

//  We use IF STATEMENT in java for conditions.
//  it works with BOOLEAN conditionals.

//  if(10 > 5){
//      System.out.println(" Condition is TRUE -> 10 is greater than 5 ");
//  }else{
//      System.out.println(" Condition is FALSE");

public class IfElseStatement {
    public static void main(String[] args) {
        if (10 > 5){
            System.out.println("condition is true");
        }else{
            System.out.println("condition is false");
        }


        int count = 25;
        if (count < 30){
            System.out.println("count is less than 30.");
        }else{
            System.out.println("count is more than 30.");
        }


        byte age = 25;
        if (age >= 18){
            System.out.println("\nEligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }
        age -= 10;
        if (age >= 18){
            System.out.println("\nEligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else {
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }




    }
}
