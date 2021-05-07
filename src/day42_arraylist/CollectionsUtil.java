package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
       List<Character> letters = new ArrayList<>();
       letters.addAll(Arrays.asList('a', 'd','z', 'h', 'o', 'b', 't', 'd'));
        System.out.println("size = " + letters.size());

        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("Reversed = " + letters);
        
        Collections.reverse(letters);
        System.out.println("letters = " + letters);

        System.out.println(Collections.frequency(letters, 'z'));

        int dCount = Collections.frequency(letters, 'd');
        System.out.println(dCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'd', 'u');
        System.out.println("After replace = " + letters);

        Collections.sort(letters);
        System.out.println(letters);

        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 0, 1, 5, 7, 1, 1);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println(Collections.frequency(nums, 1));

        int countOf7s = Collections.frequency(nums, 7);
        System.out.println("count of 7 = " + countOf7s);

        Collections.replaceAll(nums, 1, 50);
        System.out.println("nums = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println("nums after shuffle = " + nums);

    }
}
