package day24_loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = 30;
        int guessingNumber;
        do {
            System.out.println("Guess the secret number:");
            guessingNumber = scan.nextInt();
            if(guessingNumber < 0){
                System.out.println("Your number is too small");
            } else if(guessingNumber > 100){
                System.out.println("Your number is too large");
            }

        } while (secretNumber != guessingNumber);
        System.out.println("Cogratulations, you won! Secret Number: " + secretNumber);

    }
}
