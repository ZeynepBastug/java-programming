package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        // variable of Worker object of SuperMan
        Worker sm1 = new SuperMan();
        sm1.work("QA Manager");
        sm1.getPaid();

        ((Father)sm1).raiseKid();
        ((SuperMan)sm1).playWithKid();

        // DOWNCASTING FROM WORKER TO SUPERMAN

        SuperMan superMan = (SuperMan) sm1;
        superMan.feedKid();
        superMan.work("java dev");



    }
}
