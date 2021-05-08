package day43_list_custom_classes;

import java.util.*;

public class MethodsWithListReturn {
    public static void main(String[] args) {

        long start = System.nanoTime();

        List<Integer> mlnNums = getIntegerList();
        long end = System.nanoTime();
        System.out.println("ArrayList time = " +(end - start));
        System.out.println(mlnNums);
        System.out.println(getIntegerList());


        long startArray = System.nanoTime();
        int[] arr = getIntegerArray();
        System.out.println(Arrays.toString(arr));
        long endArray = System.nanoTime();
        System.out.println("Array time = " + (endArray - startArray));
        double sec = (endArray - startArray) / 1_000_000_000.0;
        System.out.println("sec = " + sec);
    }

    public static List<Integer> getIntegerList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100 ; i++) {
            list.add(i);
        }
        return list;
    }


    public static int[] getIntegerArray(){
        int[] nums = new int[1001];
        for (int i = 0; i <= 1000; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
