package day56_abstraction;

public class Plane extends Transportation implements SelfDrivable{

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 10) + " to fly " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }

    public void land(){
        System.out.println("Plane is landing - buckle up");
    }
}
