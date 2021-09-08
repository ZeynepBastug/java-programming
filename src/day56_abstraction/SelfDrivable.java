package day56_abstraction;

public interface SelfDrivable {

    void autoPiloting();

    // void selfPark();  this causes error in sub classes, because they must override abstract method
    public default void selfPark(){
        System.out.println("Performing self park steps");
    }


}
