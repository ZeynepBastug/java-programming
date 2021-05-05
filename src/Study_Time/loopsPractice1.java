package Study_Time;

import java.util.*;

public class loopsPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1

        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;

        }
        System.out.println(sum);

        // 2

        for (int i = 1; i <= 100; i += 2) {
            sum += i;

        }
        System.out.println(sum);

        //3

        for (int i = 1; i <= 100; i += 2) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

        // 4

        for (int i = 0; i <= 100; i += 2) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }


        // 5

        System.out.println("Upper or Lower?");
        String answer = scan.nextLine();
        System.out.println("Ascending or Descending?");
        String answer2 = scan.nextLine();

        if (answer.equalsIgnoreCase("upper") ) {
            if(answer2.equalsIgnoreCase("Ascending")) {
                for (char i = 'A'; i <= 'Z'; i++) {
                    System.out.print(i + " ");
                }
            } else if(answer2.equalsIgnoreCase("Descending")) {
                for (char i = 'Z'; i >= 'A'; i--) {
                    System.out.print(i + " ");
                }
            }

        }else if (answer.equalsIgnoreCase("lower")) {
            if(answer2.equalsIgnoreCase("Ascending")){
                for (char i = 'a'; i <= 'z'; i++) {
                    System.out.print(i + " ");
                }

            } else if (answer2.equalsIgnoreCase("Descending")){
                for (char i = 'z'; i >= 'a'; i--){
                    System.out.print(i + " ");
                }
            }

        }
        System.out.println();

        // 6

        int maxNum = 0;
        int answer0 = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter the number:");
            answer0 = scan.nextInt();
            if(answer0 > maxNum){
                maxNum = answer0;
            }

        }
        System.out.println(maxNum);

        int minNum = 12345678;
        int answer3 = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter the number:");
            answer3 = scan.nextInt();
            if(answer3 < minNum){
                minNum = answer3;
            }

        }
        System.out.println(minNum);







    }
}