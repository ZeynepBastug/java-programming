package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        // FOR LOOP:
        //    -> We use for loop when number of iteration is fixed.

        int num = 8;

        if(num < 1 || num > 10){
            System.out.println("ERROR: invalid input.");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
