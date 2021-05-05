package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.44;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        // Decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        // NOW, we are just changing the variable value itself without adding new one.
        double kunefe = 44.90;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("balance after kunefe = " + balance);

        // second kunefe is 50% off. let's but it.
        kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("balance after second kunefe = " + balance);

        double icedTea = 2.35;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea * 3;
        System.out.println("balance after 3 iced Tea bottle = " + balance);




    }
}
