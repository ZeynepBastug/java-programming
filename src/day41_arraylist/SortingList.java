package day41_arraylist;

import java.util.*;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(120); nums.add(33); nums.add(90); nums.add(1);

        System.out.println("Before sort: " + nums);

        Collections.sort(nums);
        System.out.println("After sort: " + nums);



    }
}
