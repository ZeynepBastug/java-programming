package day53_inheritance.tesla;

public class ModelX extends ElectricCar{

    public ModelX(String model, double price, int year, int range) {

        super("Tesla", model, price, year, range);
    }

    /**
     * public void charge(){   -> ERROR: Cannot be overridden, cus charge is final method.
     *
     *     }
      */

}
