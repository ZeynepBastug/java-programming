package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int minute = 1; minute <= 10; minute++){
            System.out.println("\nminute = " + minute);
            for(int second = 1; second <= 60; second++){
                System.out.print(second + " ");
            }
        }

        //NESTED LOOP IN JAVA:
        // -> WE CAN WRITE NESTED LOOPS IN java. using while, do while, for loops.
        // basic syntax for loop:
        //     for(int i = 1; i <= 5; i++){          <- OUTER LOOP
        //          for(int j = 1; j <= 5; j++){     <- INNER/NESTED LOOP
        //          }
        //      }

        // How does it work:
        //   For each single iteration of  OUTER LOOP, INNER LOOP completes full cycle each time.0
        // OUTER LOOP equals 1, before outer loop goes ++, increases, the inner loop needs to complete FULL CYCLE (1 to 5)

        for(int minute = 0; minute <= 10; minute++ ){
            for (int second = 0; second <= 59; second++){
                System.out.println(minute + ":" + second);
            }
        }

        for (int mile = 1; mile <=10; mile++){
            System.out.println("\nmile = " + mile);
            for(int step = 0; step <= 2000; step++){
                System.out.print("step = " + step);
            }
        }

    }
}
