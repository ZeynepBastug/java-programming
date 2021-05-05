package day18_conditional_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "z";
        double leasePrice;

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400;
            } else {
                System.out.println("Invalid model");
                return;
            }
        } else if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 549;
            } else if (model.equals("A3")) {
                leasePrice = 412;
            } else {
                System.out.println("Invalid model");
                return; // exit
            }
        } else {
            System.out.println("Invalid make");
            return;
        }
        System.out.println("make: " + make);
        System.out.println("model: " + model);
        System.out.println("leasePrice: " + leasePrice);


    }
}
