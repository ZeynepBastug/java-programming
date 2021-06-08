package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("Amount after drink 10 = " + myCoffee.getAmount());
        // NOT: myCoffee.type = "Turkish coffee"; INSTEAD using a method:
        myCoffee.setType("turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());

        myCoffee.toString();
        System.out.println("myCoffee.toString() = " + myCoffee.toString());

        // ADD ANOTHER COFFEE OBJECT, SET VALUES, CALL METHODS
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        // assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        // even though we didnt assign setType java will do automatically as we assign coffee2 to coffee1

        coffee2.setType("Espresso");
        System.out.println("coffee2 = " + coffee2.getType());
        System.out.println("coffee1 = " + coffee1.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuchino");
        coffee3 = coffee2;
        System.out.println("coffee3 = " + coffee3.getType());

        Coffee coffee4 = null;  // When variable is null, it means IT DOES NOT REFER/POINT TO ANY OBJECT IN HEAP. It is just sitting in stack
        coffee4.setType("turkish"); // ERROR: NullPointerException
    }

}
