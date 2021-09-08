package day56_abstraction;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(30);
        model3.start();
        model3.stop();

        Plane plane = new Plane();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.start();
        plane.stop();
        plane.land();

        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

        sd.autoPiloting();


    }
}
