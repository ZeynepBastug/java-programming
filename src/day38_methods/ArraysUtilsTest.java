package day38_methods;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 98};

        ArraysUtils.printArray(nums);
        ArraysUtils.printArray(new int[] {23, 64, 534, 76,23,10, 9});

        System.out.println("Sum = " + ArraysUtils.sum(nums));

        System.out.println("Contains = " + ArraysUtils.contains(nums, 5));
        ArraysUtils.contains(nums,10);
    }
}
