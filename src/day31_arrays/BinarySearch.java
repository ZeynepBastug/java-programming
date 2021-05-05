package day31_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        // sorting arrays algorithms:
        // bubble sort, linier sort, quick sort, etc.
        // Arrays.sort is good to go.

        // Arrays.binarySearch():
        //    this method/function helps search in array for a value

        // Arrays.binarySearch(ArrayName, item);
        //                0   1   2   3
        // int[] nums = {33, 55, 123, 400};
        // Arrays.binarySearch(nums, 55); -> 1
        // Arrays.binarySearch(nums, 400); -> 3
        // Arrays.binarySearch(nums, 40); -> -1, -3
        // Arrays.binarySearch(nums, 300); -> ??

        // PRE-REQUISITE:
        // PRE-CONDITION: Array must be sorted for binarySearch to work. Otherwise we get unexpected result.

        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums,23));
        System.out.println(Arrays.binarySearch(nums,2344));
        System.out.println(Arrays.binarySearch(nums,25));  // -3
        System.out.println(Arrays.binarySearch(nums,700));   // -5
        System.out.println(Arrays.binarySearch(nums, 14500)); // -8

        // check if number 12345 is among numbers in array


    }
}
