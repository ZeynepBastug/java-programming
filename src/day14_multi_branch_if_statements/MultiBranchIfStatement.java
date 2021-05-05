package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        // MULTI BRANCH IF STATEMENT:
        // It is useful when we have multiple related conditions.

        // BENEFITS OF MULTI BRANCH| MULTI WAY IF STATEMENT:
        //  -> More organized code
        //  -> More efficient code
        //  -> Combining related conditions in same multi branch
        //  -> Easier to maintain
        //  -> Easier to read the code
        // HOWEVER:
        //  -> Cannot used if only single condition
        //  -> use only when you have multiple conditions related to each other

        byte day = 3;

        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }

        if (day == 2) {
            System.out.println("Tuesday");
        }

        if (day == 3) {
            System.out.println("Wednesday");
        }

        System.out.println("===============MULTI BRANCH IF STATEMENT===============");

        day = 1;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Java day!");
        }

        // When we use multi branch if statement, we combine multiple related conditions into one.
        // Java checks each condition from top the bottom, once it finds true condition, it will run the code for that
        // if, and exists. It does not check other conditions below.

        // Optionally we can include else block at the very end, and it only RUNS when ALL of conditions are false.


    }
}
