package day58_polymorphism.shop;

public class Amazon extends OnlineShopping implements Prime{

    @Override
    public void buy() {

    }

    @Override
    public void sell() {
        System.out.println("Buying items on amazon.com");
    }

    @Override
    public void ship() {
        System.out.println("Selling items on amazon.com");
    }

    @Override
    public void primeShipping() {
        System.out.println("Shipping items via amazonPrime");
    }
}
