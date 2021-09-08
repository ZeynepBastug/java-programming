package day62_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        Collection<String> schools = new ArrayList<>();
        cities.add("McLean"); //add method from Collection or List interface
        cities.add("Vienna");
        cities.add("New York");
        cities.add("New York");

        System.out.println(cities);

        schools.add("harward");

        System.out.println("first cities = " + cities.get(0));
        System.out.println("Count of cities = " + cities.size());




    }
}
