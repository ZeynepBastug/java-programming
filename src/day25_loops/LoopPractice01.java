package day25_loops;

import java.util.Scanner;

public class LoopPractice01 {
    public static void main(String[] args) {

        // add even numbers till 100
        int sum = 0;
        for(int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nsum " + sum);

        // add odd numbers til 100
        for(int i = 1; i <= 99; i += 2){
            System.out.print(i + " ");
        }
        System.out.println("\nsum " + sum);



        for(int i = 1; i <= 99; i += 2){
            if (i % 15 == 0){
                System.out.println("i = " + i);
            }
        }


        for(int i = 0; i <= 100; i += 2) {
            if(i % 15 == 0){
                System.out.println("i = " + i);
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Upper or Lower");
        String answer = scan.nextLine();
        System.out.println("do you wanna show the alphabet in ascending or descending?");
        String answer2 = scan.nextLine();

        char a = 65;
        char b = 97;
        for(int n = 1; n <= 26; n++){
            if (answer.equalsIgnoreCase("upper") && answer2.equalsIgnoreCase("ascending")) {
                System.out.println(a);
                a++;
            } else if(answer.equalsIgnoreCase("lower") && answer2.equalsIgnoreCase("ascending")){
                System.out.println(b);
                b++;
            }
        }

        for(int n = 26; n <= 1; n--){
            if (answer.equalsIgnoreCase("upper") && answer2.equalsIgnoreCase("descending")) {
                System.out.println(a);
                a++;
            } else if(answer.equalsIgnoreCase("lower") && answer2.equalsIgnoreCase("descending")){
                System.out.println(b);
                b++;
            }
        }






    }
}
