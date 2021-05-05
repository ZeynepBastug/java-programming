package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Waterloo");
        cities.add("Toronto");
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Vancouver");
        cities.add(0, "New York City");

        System.out.println(cities);

        System.out.println("first city: " + cities.get(0));

        System.out.println("last city: " + cities.get(cities.size()-1));

        System.out.println("number of items: " + cities.size());

        int size = cities.size();

        System.out.println("there are " + size + " cities in the list");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(i + 1 + "- " + cities.get(i));

        }

        for (int i = 0; i < cities.size()/2 ; i++) {
            System.out.println(i + 1 + "- " + cities.get(i));

        }

        for(String eachCity : cities){
            System.out.println(eachCity);
        }

        cities.remove(3);

        cities.remove("Vancouver");

        System.out.println("after remove: " + cities);

        //delete/remove all values from list
        cities.clear();

        // make sure it is clear
        // 1) print|spit it out
        System.out.println(cities);

        // 2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }else {
            System.out.println("list is not empty");
        }


    }
}
