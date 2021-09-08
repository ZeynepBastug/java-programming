package day62_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        // polymorphism
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("index 0 = " + scores.get(0));

        friends.add("Zeynep");
        friends.add("Ali");
        friends.add("Yakup");

        friends.addFirst("Hazel");
        System.out.println(friends);




    }
}
