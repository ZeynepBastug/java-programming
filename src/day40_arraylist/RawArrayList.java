package day40_arraylist;

import java.lang.reflect.Array;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        /** Arraylist is a class in java. that is used to store multiple sets of data like array.
         *  1) it keeps index ordering
         *  2) it allows duplicated values

         *  DECLARE ARRAYLIST:
         *  2 Ways
         *  ArrayList list = new ArrayList();
         *  List list2 = new ArrayList();  - > polymorphic way
         *  Arraylist is located in java.util package and needs to be imported
         */

        // Declare raw ArrayList
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        // add value
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("Wooden spoon");

        System.out.println(list1);
        System.out.println("size = " + list1.size());

        // As you can see - the above list is of RAW type and allows any type of data. It is not recommended.
        // Instead we need to use Restricted Type that only allows certain type of data.

        ArrayList<Integer> nums = new ArrayList<>(); // -> RESTRICTED
        ArrayList nums1 = new ArrayList();  // -> RAW

        // ARRAYLIST Internally USES Arrays. It is based on Array. It wraps around normal array. it uses dynamic array
        // by copying values.



    }
}
