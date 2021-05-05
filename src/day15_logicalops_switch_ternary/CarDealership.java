package day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {

        double budget = 5_000.0;
        double carPrice = 4_000.0;
        String model = "Toyota";

        if(carPrice <= budget && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")){
            System.out.println("Ready to purchase model = " +model + ", price = $" + carPrice);
        }else{
            System.out.println("Not interested in model = " + model + ", price = $" + carPrice);
        }






    }
}
