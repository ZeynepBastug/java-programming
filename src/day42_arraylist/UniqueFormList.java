package day42_arraylist;

import java.util.*;

public class UniqueFormList {
    public static void main(String[] args) {
        // declare Integer arraylist with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println("nums = " + nums);

        List<Integer> uniqueList = getUniqueIntegers(nums);

        System.out.println(uniqueList);


    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        // new arraylist to store only unique numbers
        List<Integer> uniqueList = new ArrayList<>();

        // loop through the list
        for(int eachNum: nums){
            // Check if number appears only ONCE in the list
            if(Collections.frequency(nums, eachNum) == 1){

                uniqueList.add(eachNum);
            }
        }
        return uniqueList;

    }
}
