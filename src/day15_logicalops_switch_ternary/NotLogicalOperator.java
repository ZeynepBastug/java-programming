package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {

        // ! NOT OPERATOR
        // It takes boolean value (true or false) and reverses it.
        // !true --> false
        // !false --> true

        // int apples = 5;
        // !(apples >2) --> false. As condition itself it true, but ! operator reverses the result.

        // !(apples < 3) --> true

        // != --> is not equal comparison operator.

        System.out.println(" !true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        // check if age is not more than 7. Print "Need to sit in child car seat. age

        if (age < 7) {
            System.out.println("Need to sit in child car seat. ");
        } else {
            System.out.println("Can sit normal seat. Age = " + age);
        }


        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat.");
        } else {
            System.out.println("Can sit normal seat. Age = " + age);
        }

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is now allowed here. Exit.");
        } else {
            System.out.println("This area is for smoking.");
        }

        boolean isAffordable = true;

        if (!isAffordable) {
            System.out.println("Item is not affordable");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";

        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        // Logical Operators:
        // &&, ||, !
        // && -> returns true when both conditions are true
        // || -> returns true when one or both conditions are true
        // ! -> reverses !true to false. and !false to true

        // We can also use them in combination, it is better to use parenthesis to get correct result.
        // we can use any of operators multiple times in the same statement. It'll go from left to right.

        // && --> &
        // || --> |

        // There is slight difference between double && (short circuit) and &

        // int apples = 5;
        // int oranges = 10;

        //      T             T
        // apples == 5 && oranges == 10
        //             T

        //       F          NOT CHECKED
        // apples == 15 && oranges == 10
        //             F

        //       T            F
        // apples > 1 && oranges == 11
        //            F


        //      F              T
        // apples == 5 & oranges == 10
        //            F


        // When we use && (short circuit), it is more efficient,
        // if java already knows the END result just by evaluation/checking the FIRST condition, then it will SKIP
        // checking the next condition.

        // 5 < 3 && 10> 4
        // ONLY 5 < 3 is checked/evaluated  cus java already knows if first one is FALSE, overall result wil end up being false.

        // When we use & (and), it'll evaluate/check BOTH conditions no matter what.
        //    F       T
        //  5 < 3 & 10 > 4
        //        F

        // Both 5 < 3, 10 > 4 are checked/evaluated before returning end result.

        // ============================

        // && is more efficient compared to &
        // so try to use && always.

        // Situation where single(&) is needed. It'll e only needed when there is some function/method call on right side
        // that you want to be executed.

        // double price = 34.5;
        //      F           RUN THIS TOO, to verify items with that price
        // price > 50.0 & verifyItems(price)
        //              F

        //===================================

        // || (short circuit) is more efficient compared to | (single pipe)

        // When we use || OR operator, if end result is clear after checking first condition then second condition will
        // be skkipped. Not checked.
        //   T       SKIPPED
        // 5 > 4 || 3 < 2
        //       T

        // When we use | OR operator, both are checked, no matter what.
        //   T       F
        // 5 > 4 | 3 < 2
        //       T

        // We always use ||, && to make our code little bit more efficient for processing.
        //=================================

        // int num = 5;
        // int num2 = 20;

        //      F
        // if(num > 4 && num2 == 20)    --> FALSE

        // Since first condition is already false, second one will NOT be checked.
        // java already knows that overall result wil be FALSE

        // int num1 = 5;
        // int num2 = 20;

        //        F           T
        // if(num1 < 4 & num2 == 20) --> FALSE

        // Both conditions are checked, then end result FALSE is returned. Cus we use & (and)
        // *** So, the difference is && is more efficient for execution compared to &, and AVOID using & at all times.











    }
}
