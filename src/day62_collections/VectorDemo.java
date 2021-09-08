package day62_collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    // vector and arraylist use arrays internally
    // vector is thread safe and synchronized, whereas, arraylist is not thread safe and is faster.
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();
        states.add("MA");
        states.add("TX");
        states.add("VA");
        states.add("IL");
        states.add("FL");


        System.out.println(states);
        // VECTOR is synchronized
        

    }
}
