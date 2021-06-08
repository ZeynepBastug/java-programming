package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        // == ONLY checks

        String word1 = "java"; // from String Pool
        String word2 = "java"; // re-use from String pool
        String word3 = new String ("java"); //creates in heap, outside String pool
        String word4 = new String ("java");

        System.out.println(word1 == word2); // point to different object in heap
        System.out.println(word1 == word3); // point to different object in HEAP and in POOL
        System.out.println(word3 == word4); // point to different objects in HEAP

        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word3.equals(word4));

    }
}
