package day24_loops;

import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int start = 1;
        int numberToStop = scan.nextInt();
        while (start <= numberToStop){
            System.out.println(start + " ");
            start++;
        }

    }
}
