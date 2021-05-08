package day31_arrays;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        /**
         * Arrays utility class: has useful methods to work with arrays.
         * It is located in java.util package.
         * import java.util.Arrays;
         *
         * 1) Arrays.sort(arrayName) method:
         *    it'll sort the array in ascending (small to large) order
         *    a - z
         *    1 - 100..
         *
         * int[] nums = {5, 1, 7, 0};
         * Arrays.sort(nums);
         *
         * nums -> {0, 1, 3, 5, 7}
         *
         * 2) Arrays.toString(arrayName);
         *    it'll help us print array values in single statement WITHOUT using a loop.
         *    It'll convert any array to String, and help print in one statement.
         *
         * int[] nums = {5, 1, 7, 0};
         * System.out.println(Arrays.toString(nums));
         *  {5, 1, 7, 0}
         */

        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        // print all nums in same line
        System.out.println(Arrays.toString(nums));

        // sort nums
        Arrays.sort(nums);
        // print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        // Arrays.sort(nums);, Collections.reverseOrder())

        String[] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ", words) + "]");

        // sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse order

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

        // HOW TO SORT AN ARRAY:
        // EASIEST:
        //     Arrays.sort(arrayName);
        //     It'll sort in ascending order

        // Reverse Order:
        //     Arrays.sort(arrayName, Collections.reverseOrder());
        //     But does not work with primitive type arrays, only object type.






    }
}
