package day46_encapsulation;

public class Car {
        // OOP principles:
        //   - Encapsulation
        //   - Inheritance
        //   - Abstraction
        //   - Polymorphism

        // ENCAPSULATION: - data/information hiding -
        // Make instance variables PRIVATE, and provide PUBLIC getter and setter methods to access the instance variables.
        // We hide PRIVATE information. SSN, salary, passwords, DL, bank account information, card numbers.. You hide this data
        // from outside, because it is private for you And you grant access to authorized requests.
        // - In java, when we write custom classes, WE CASULATE our INSTANCE VARIABLES.
        // how to encapsulate/hide instance variables -> we use PRIVATE keyword with variables.
        // Once we add Private keyword, the variable can only be accessed in SAME class, nowhere

        // Benefit:
        //     - protect instance variables from invalid values.
        //     - we can use conditions in setter methods to verify if data that is requested



    private String model;
    private int year;
    private int mileage;

    // setter method for model
    public void setModel(String carModel){
        model = carModel;
    }

    // getter method for model
    public String getModel(){
        return model;
    }

    // setter for year
    public void setYear(int modelYear){
        year = modelYear;
    }

    // getter for year
    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMileage(int carMileage){
        this.mileage = carMileage;
        // this.type = type; -> this keyword means THIS INSTANCE OF THE CLASS.
        // this.type -> means type variable with is INSTANCE variable.
        // We need this. keyword in our methods when method paramater variable has same name as instance variable.
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
