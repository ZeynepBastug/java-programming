package day31_arrays;

import java.util.*;

public class ArrayEquals {
    public static void main(String[] args) {
        // EQUALS METHOD IN ARRAYS CLASS:
        //   Accepts 2 arrays of same type and returns true:
        //         If arrays are same length
        //         and have same data in same order
        //   otherwise
        //         returns false

        int[] num1 = {4, 5, 2, 10};
        int[] num2 = {4, 5, 2 ,10};
        int[] num3 = {10, 4, 5, 2};
        int[] num4 = {4, 5, 2, 10, 90};
        int[] num5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String[] cars4 = {"Toyota", "Honda", "Tesla"};

        System.out.println("num1 == num2 " + Arrays.equals(num1,num2));
        System.out.println(num1 == num2); // check if point to same object in menu

        if(Arrays.equals(num3, num2)){
            System.out.println("num2 and num3 match ");

        } else {
            System.out.println("num2 and num3 mismatch");
        }

        System.out.println("cars1 == cars2 -> " + Arrays.equals(cars1, cars2));
        System.out.println("cars2 == cars3 -> " + Arrays.equals(cars2, cars3));


    }
}
