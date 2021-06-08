package day47_constructors;

public class AddressList {
    public static void main(String[] args) {

        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7935 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7935 Jones Branch Dr Suite 3200");
        System.out.println("address after update: " + cybertekAddress);
        System.out.println("street info: " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());
        newAddress.setStreet("7921 Jones branch dr suite 200");
        newAddress.setCity("McLean");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address papaJohnPizza = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("papaJohnPizza.toString() = " + papaJohnPizza.toString());

    }
}