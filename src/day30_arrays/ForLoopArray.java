package day30_arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ForLoopArray {
    public static void main(String[] args) {
        // LOOPING Through items in an array:
        //    We can use while, do while, for loop, for each loop.
        // FOR LOOP with array:
        //    We can use for loop that starts with index 0 until array.length
        // EX:
        //    int[] nums = {22, 55, 11};
        //    for(int i = 0; i < nums.length; i++){
        //        System.out.println(nums[i]);
        //    }

        // FOR EACH loop: is used with collections of data in java, we can use FOR each loop with arrays, arraylists, maps,
        // sets, or any other collections/data structures.

        // FRO EACH LOOP works ONLY with Collection of data.

        // int[] nums = {33, 11, 66};

        // for(int each : nums) {
        //    System.out.println(eachNum);
        // }

        // for(temp variable : arrayNum) {

        // }

        // When we use for each loop. We need 2 parts,
        // 1) for each loop/temp variable with same data type as array.
        // 2) we need an array or other collection after:

        // It will iterate for each item in array and store the value into loop variable. And we can use that variable
        // inside the loop. Java automatically knows how many items are there in the array.

        // Advantage over FOR LOOP:
        //    - simpler, short code
        //    - no need to deal with indexes
        //    - automatically loops from index 0 to last index

        // Disadvantages:
        //    - ONLY loops forward, cannot loop backwards
        //    - Cannot read ahead the values in other indexes

        int[] data = {32, 455, 76, 90, 768, 345, 66, 3};

        for(int eachNum : data){
            System.out.println(eachNum);
        }

        for(int n: data){
            System.out.print(n + " ");
        }
        System.out.println("------- FOR LOOP -------");

        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);

        }

        System.out.println("last value: " + data[data.length-1]);

        for(int idx = data.length-1; idx >= 0 ; idx--){
            System.out.print(data[idx] + " ");
        }

    }
}
