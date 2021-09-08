package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count; // all objects will share variables
    public static final int MAX_RANGE = 400;


    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    public ElectricCar(String make, String model, double price, int year, int range) {

        setMake(make); // Reuse the code in the setter condition.
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;

    }

    // FINAL KEYWORD
    public final void charge(){
        System.out.println("Charging the Electric car using pug-in");
        this.range = MAX_RANGE;
    }

    protected void drive(int miles){
        if(range == 0 || range - miles <= 0 ){
            System.out.println("ERROR: Cannot drive that far, need to charge");
        } else {
            range -= miles;
            System.out.println("Driving " + miles + " miles . . . ");
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make.isEmpty()){
            System.out.println("ERROR: make cannot be blank");
        }else {
            this.make = make;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        count = count;
    }
}
