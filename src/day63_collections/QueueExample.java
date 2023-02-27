package day63_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("four");
        q.add("two");
        q.add("one");
        q.add("ali");

        System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q);

    }
}
