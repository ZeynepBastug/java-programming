package Repl;

import java.util.*;

public class sinav {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double rent = 1000;

        System.out.println("please enter your bedroom number");

        int bedroom = scan.nextInt();

        if(bedroom == 1){
            rent += 100;

        } else if (bedroom == 2){
            rent += 200;
        } else if (bedroom == 3){
            rent += 300;
        } else if(bedroom == 0){
            rent = 1000;
        } else {
            System.out.println("Sorry we don't have " + bedroom + " bedroom house.");
        }

        System.out.println("do you want a parking lot?");

        scan.nextLine();
        String parkingLot = scan.nextLine();

        if (parkingLot.equals("yes")){
            rent += 200;
            System.out.println(bedroom + " bedroom apartment rent is: " + rent);
        } else {
            System.out.println(bedroom + " bedroom apartment rent is: " + rent);
        }











    }



}