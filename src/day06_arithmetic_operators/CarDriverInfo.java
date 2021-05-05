package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String[] args){
        String carModel = "Range Rover Sports";
        String driverName = "Zeynep Hazel Bastug";
        String licenceNum = "B007 1234 3456 1234";
        Short speed = 80;
        boolean isAutomatic = true;
        char licenceClass = 'G';

        System.out.println("Car Model is " + carModel);
        System.out.println("Driver Name is " + driverName);
        System.out.println("Licence Number is " + licenceNum);
        System.out.println("Speed is " + speed + "km/h");
        System.out.println("It's an automatic: " + isAutomatic);
        System.out.println("Licence Class is " + licenceClass);


        System.out.println(isAutomatic + "" + licenceClass);
        //   +, will not work with all data types.
        //   GOOD:
        //
        //  --> It will also work fine with number
        //   NOT GOOD:
        //   if we have uncompatible data types, it will not work.
        //   EX: boolean and char






    }
}
