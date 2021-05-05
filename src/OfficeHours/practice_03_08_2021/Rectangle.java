package OfficeHours.practice_03_08_2021;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length, width;

        length = scan.nextInt();
        width = scan.nextInt();

        int perimeter = 2 * length * width;
        int area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);






    }
}
