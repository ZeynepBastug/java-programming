package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1); // print with default values that are set in no-args constructor.
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2); // create object and assign values in same statement
        Customer cs3 = new Customer("John Ward III", 3);

        System.out.println(cs2);
        System.out.println(cs3);

        // Array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Besir", 449)};

        // arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Besir", 449));
        customerList.add(new Customer("Bihter", 13444));

        System.out.println(customerList);
        // print info of first customer object in array and arrayList
        System.out.println("-----------FOR LOOP-----------");
        for (int i = 0; i < customerList.size() ; i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("--------FOR EACH LOOP--------");
        for(Customer each : customerList){
            System.out.println(each);
        }

        System.out.println("-----NAMES OF CUSTOMERS-----");
        customerList.forEach(each -> System.out.println(each.getName()));

        // NO-ARGS constructor
        // Every single class in java, has a constructor
        // When programmer does not add any type of constructor in his class, compiles will provide no-args constructor.
        // if programmer adds a constructor, compiler will not provide any constructor.



    }
}
