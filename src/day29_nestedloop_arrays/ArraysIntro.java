package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // ARRAY - COLLECTION OF DATA OF SAME TYPE
        // So far, we have been using single variables with single data:
        // int count = 10;
        // double price = 4.55;
        // String day = "Saturday";
        // String student = "Zeynep";
        // String student2 = "Hazel";
        // String city = "Waterloo";

        // What if in our program we need to store 5 different city names.
        // We could use 5 different variables:
        // String city1 = "Waterloo";
        // String city2 = "Oakville";
        // String city3 = "Toronto";
        // String city4 = "Ajax";
        // String city5 = "Hamilton";


        // We could use 5 different variables, what if want to write program for all 100 cities of Ontario.
        // Program that stores emails of all students in B22.
        // String email1, email2, email3... email400;

        // In programming, we always deal with large amounts of data of different types. or some groups of data.
        // For that each programming language has DATA STRUCTURES to easily and efficiently work with multiple sets of data.

        // The most popular of DATA STRUCTURES: is ARRAY
        // in Java: array, list, map, set...

        // ARRAY - COLLECTION OF DATA OF SAME TYPE
        // INSTEAD OF:
        // String city1 = "Waterloo";
        // String city2 = "Oakville";
        // String city3 = "Toronto";
        // String city4 = "Ajax";
        // String city5 = "Hamilton";

        // String[] cities = {"Waterloo", "Oakville", "Toronto", "Ajax", "Hamilton"}

        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        // print values of array
        System.out.println(nums[0]);

        // In Java, ARRAYS ARE FIXED SIZE, NOT RE-SIZEABLE,
        // Once we declare an array with certain size, we cannot change the size/ length.
        // If you need resizeable ARRAY, java provides ARRAYLIST as an option, which size can be modified.
        // Other languages allow resizeable array.

        int i = 0;
        System.out.println(nums[i]);

        i++;
        System.out.println(nums[i]);

        // how to find out the size of the array.
        System.out.println("number of elements: " + nums.length);  // no paranthesis
        // store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        // change values in the array;
        nums[0] = 100;
        nums[2] = nums[1];

        // There are different ways of declaring and assigning values to array
        // 1) Declare and specify the size, than assign values.
        //    int[] nums = new int[3];
        //    nums[0] = 123;
        //    nums[1] = 567;
        //    nums[2] = 12;
        //    In above, size is 3, but largest index is 2.
        // This way is good to use when we know the count of items we need, but do not know the values yet.

        // 2) Declare and assign value in same statement.
        //    int[] nums = {234, 12, 345, 234, 574, 90}
        //    In above example, we declare array with size 6 and assigned values in same statement.
        // This way is good to use when we have already have data to assign to our array.

        // 3) Declare and assign value in same statement.
        //    double[] prices = new double[]{10.3, 44.0, 23.99};
        //    int[] nums = new int[]{234, 12, 345, 76, 567, 99};





    }
}
