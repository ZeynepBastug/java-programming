package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        // car1.model = "Nissan Altima"; -> ERROR, model is PRIVATE and cannot be accessed
        car1.setModel("Nissan Altima");
        System.out.println("car model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car year = " + car1.getYear());

        car1.setMileage(45_000);
        System.out.println("car mileage = " + car1.getMileage());

        System.out.println(car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD ");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(120_000);
        System.out.println(alfaRomeo.getModel() + " " + alfaRomeo.getYear() + " " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
    }
}
