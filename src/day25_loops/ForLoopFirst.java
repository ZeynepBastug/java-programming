package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        // While, and do while loops, can be used with numbers as conditions, or boolean variables, boolean statements
        // FOR LOOP:
        // Another type of loop in java is FOR LOOP:
        // 2 types of FOR LOOP:
        //    1) for loop with iterator/counter
        //    2) for each loop -> works with collections, need array topic to learn

        // FOR LOOP -> normally used when we know how many times it will repeat beforehand.

        /**
         * for(;;){
         *   System.out.println("Java is fun");
         *  }
         * above is infinite loop with for loop: while(true){   }
         */

        // for(initializing; condition; updates)
        for(int i = 0; i <= 5; i++){
            System.out.println("Hello world");
            // for loop: 1-10 print the number
        }

        for(int n = 1; n < 11; n++){
            System.out.println(n);
        }
    }
}
