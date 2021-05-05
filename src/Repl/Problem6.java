package Repl;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a citizen of USA?");
        String citizenship = scan.nextLine();
        System.out.println("Are you a resident of USA?");
        boolean resident = scan.nextBoolean();

        if(citizenship.equalsIgnoreCase("no") && resident == false ){
                System.out.println("You must be a Citizen of the USA or a resident");

        }else if(citizenship.equalsIgnoreCase("yes") || resident == true){

            System.out.println("How old are you?");
            scan.nextLine();
            int age = scan.nextInt();
            if(age <= 18 && age >= 35) {
                System.out.println("Your age must be between 18 to 35 years old");
            } else if (age >= 18 && age <= 35){
                System.out.println("Do you have a high School Diploma?");
                boolean highSchool = scan.nextBoolean();
                if(highSchool == false) {
                    System.out.println("You must have a high School Diploma");
                }else{
                    System.out.println("You are qualified for the US Army");
                }
            }
        }
    }
}
