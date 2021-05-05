package day28_loops;

import java.util.*;

public class BreakVsContinue {
    public static void main(String[] args) {

        int[] nums = {14,1,84,97,1243,46};
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 != 0){
                t += 5;
            } else {
                t+=10;
            }
        }
        System.out.println(t);
    }
}
