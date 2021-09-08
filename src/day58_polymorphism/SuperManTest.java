package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {

        Father sm1 = new SuperMan();
        sm1.playWithKid();
        sm1.feedKid();
        sm1.raiseKid();
        // sm1.work("SDET");  -> ERROR - sm1 is Father type can only access methods in father

        Worker sm2 = new SuperMan();
        sm2.work("SDET");
        System.out.println("got paid $" + sm2.getPaid());

        // sm2.raiseKid(); -> ERROR

        SuperMan sm3 = new SuperMan();
        sm3.getPaid();
        sm3.work("Scrum Master");
        sm3.feedKid();
        sm3.playWithKid();
        sm3.raiseKid();




    }
}
