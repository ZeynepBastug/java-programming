package Repl;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What grade are you? ");
        byte grade = scan.nextByte();
        String schoolLevel;
        switch (grade){
            case 1: case 2: case 3: case 4: case 5:
                schoolLevel = "Elementary school";
                break;
            case 6: case 7: case 8:
                schoolLevel = "Middle school";
                break;
            case 9: case 10: case 11: case 12:
                schoolLevel = "High school";
                break;
            case 13: case 14: case 15: case 16:
                schoolLevel = "College";
                break;
            case 17: case 18:
                schoolLevel = "Grad school";
                break;
            default:
                schoolLevel = "Invalid grade level given";
                break;
        }
        System.out.println(schoolLevel);

    }
}
