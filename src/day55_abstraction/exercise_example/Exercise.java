package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){
        System.out.println("Warming up and starting the exercise ");
    }
    // - Abstract method - method without body/impl, just signature...
    public abstract void perform();

    // - Another abstract method that concrete sub classes will override/implement..
    public abstract int getCaloriesCount(int minutes);

}
