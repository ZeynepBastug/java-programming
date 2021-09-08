package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        /**
         * SET
         * Set Interface: unordered, which means there is no indexes. Does not allow to duplicate elements.
         *
         * HashSet: Class that implements set
         *    -> Based on an algorithm that is fast and efficient to find element
         *
         * LinkedHashSet: implements Set
         *    -> maintains insertion order
         *
         * TreeSet: implements SortedSet
         *    -> stores elements into their natural order. Also has additional methods for searching
         *
         * P.S: If you want ot remove an element in a loop from a set you would need to use an Iterator.
         */

        Set<Integer> set = new HashSet<>();
        // list - ArrayList

        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("Hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        words.remove("world");


        // words.get()

        System.out.println(words);

        // convert your Set to a List
        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("world");

        System.out.println(wordsList);

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("$#");
        linkedHashSet.add("53");
        linkedHashSet.add("apple");
        linkedHashSet.add("java");
        linkedHashSet.add("53");
        linkedHashSet.add("cucumber");

        System.out.println(linkedHashSet);

        // treeSet
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("53");
        treeSet.add("apple");
        treeSet.add("java");
        treeSet.add("53");
        treeSet.add("Cucumber");

        System.out.println(treeSet);

    }
}
