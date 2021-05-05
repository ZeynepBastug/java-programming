package Repl;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("year:");

        int year = scan.nextInt();
        if(year >= 1346 && year <= 1353){
            System.out.println("The Black Death");
        }else if (year >= 1665 && year <= 1666) {
            System.out.println("Great Plague of London");
        } else if (year >= 1770 && year <= 1772){
            System.out.println("Russian Plague");
        } else if (year >= 1889 && year <= 1890){
            System.out.println("Flu Pandemic");
        } else if (year == 1916) {
            System.out.println("American Polio Epidemic");
        } else if (year >= 1918 && year <= 1920) {
            System.out.println("Spanish Flu");
        } else if (year >= 2009 && year <= 2010) {
            System.out.println("H1N1 Swine Flu Pandemic");
        } else if (year >= 2014 && year <= 2016) {
            System.out.println("West African Ebola Epidemic");
        } else if (year >= 2020 && year <= 2021){
            System.out.println("COVID-19");
        } else if (year <= 0 && year >= 2021) {
            System.out.println("Invalid year");
        } else {
            System.out.println("No pandemic");
        }



    }
}
