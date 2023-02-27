package day63_collections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        /**
         * STACK
         * Child class of Vector. (LIFO - last in first out)
         * As elements are added into the stack the newest element is at the top of stqack
         * To use the LIFO functions we would use peak(), pop(), push()
         *
         * QUEUE
         * Interface that uses FIFO (First In First Out)
         * This data structure has additional functionality to insert, extract, and look for information
         * add()     -> offer()
         * remove()  -> poll()
         * element() -> peek()
         */


        // LIFO

        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leaders Eat last");

        System.out.println(bookStack);

        // bookStack.pop); removes and returns the top pf the stack item
        System.out.println(bookStack.pop());

        System.out.println(bookStack);
    }
}
