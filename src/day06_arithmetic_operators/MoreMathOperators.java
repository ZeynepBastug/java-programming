package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        short toyotas = 431;
        short hondas = 233;
        short vw = 2;
        short tesla = 20;
        short nissan = 1;
        short bmw = 155;
        int totalCarsParkingLot = toyotas + hondas + vw + tesla + nissan + bmw;

        System.out.println("There are " + totalCarsParkingLot + " cars in the parking lot");


        String pizza = "Hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " + people + " people ate " + slicesPerPerson + " slices each.");

    }
}
