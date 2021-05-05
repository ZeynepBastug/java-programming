package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        // DO WHILE LOOP
        // do while loop is similar to while loop. Except the condition is checked at the bottom.

        // FLOW IS:
        //       1) Run the code the loop body
        //       2) Check the boolean condition
        //           - if condition is true, go to step 1
        //           - if condition is false, exit the loop

        // WHILE LOOP:
        //       while loop checks the condition first, then if condition is true.
        //       it'll run the loop body. Condition is checked at the beginning.
        //       If condition is false at the beginning, the loop body will not run at all.

        // FLOW:
        //       1) check boolean condition
        //          - if condition is true go to step 2
        //          - if condition is false exit the loop
        //       2) run/execute loop body, go to step 1

        // So DO WHILE loop ensure that your code will run at least once.

        int count = 0;
        do{
            System.out.println("count = " + count);
            count += 100;
        } while (count <= 1000);
        count++;

    }
}
