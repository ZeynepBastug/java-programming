package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        // While loop -> similar to if statement, it checks if the condition is true, and runs the while loop block code,
        // and it'll keep running the code as long as condition stays true.

        // INFINITIVE LOOP: Loop that does not stop, because boolean condition is always true.
        // it keeps running code in loop block

        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        // LOOPS IN PROGRAMMING are used to repeat same block of code multiple times, as long as condition is true.
        // They are very useful for repetitive actions.

        int apples = 0;
        while (apples <= 10){
            System.out.println("apples = " + apples);
            apples++;
        }
        System.out.println("apples = " + apples);

        
    }
}
