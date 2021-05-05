package day40_arraylist;

import java. util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        /** ArrayList Methods:
             - .add(value)    -> adds value to ArrayList
             - .size()        -> returns the size of ArrayList
             - .get(index)    -> returns value at the index
             - .remove(index) -> removes element at the given index
             - .remove(value) -> removes the value from ArrayList
             - .isEmpty()     -> checks if list is empty
             - .contains(element) -> check if element is present in list
             - .clear()       -> remove all elements
         */

        ArrayList <Integer> nums = new ArrayList<>();
        //           <int>  -> won't work
        nums.add(5);
        nums.add(7);
        nums.add(11);
        // nums.add("java");    -> ERROR - cus we declare only <integer>
        System.out.println("size = " + nums.size());

        // reading from arrayList
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        // System.out.println(nums.get(3));   -> ERROR - IndexOutOfBoundException

        // print all values in same line:
        System.out.println(nums);   // Arrays.toString(numArray)

        nums.remove(1);  // remove element at index 1
        System.out.println(nums);



    }
}
