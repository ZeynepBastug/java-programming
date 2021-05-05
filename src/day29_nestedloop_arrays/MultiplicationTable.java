package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            for(int n = 1; n <= 10; n++){
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }


        // Nested loop: when we use nested fro loop, we can use the variable of outer loop inside the inner loop.

        // Or inner loop, can loop until the value of outer loop iterator.

        // we use nested loops, when reading data from excel files, multi-d arrays, where there is ROW and COlUMN.
        // ROW -> outer loop
        // COLUMN -> inner loop



    }
}
