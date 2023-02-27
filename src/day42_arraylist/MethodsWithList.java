package day42_arraylist;

import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        // declare String arraylist and add values
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("java", "html", "selenium", "a", "input", "title"));
        printStrList(words);


        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(nums);
        System.out.println(sumInteger(nums));
    }


    public static void printStrList(List<String> stringList) {
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static int sumInteger(List<Integer> List){
        int sum = 0;
        for (int eachNum : List) {
            sum += eachNum;
        }
        return sum;
    }


}
