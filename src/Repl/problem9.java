package Repl;
import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the House Type:");
        String houseType = scan.nextLine();
        int maxOccupants = 0;

        switch (houseType){
            case "Tree House":
                maxOccupants = 1;
                break;
            case "Mobile home":
                maxOccupants = 2;
                break;
            case "Apartment":
                maxOccupants = 4;
                break;
            case "Town House":
                maxOccupants = 6;
                break;
            case "Villa":
                maxOccupants = 8;
                break;
            case "Mansion":
                maxOccupants = 10;
                break;
        }
        System.out.println("Max occupants: " + maxOccupants);


    }
}

