package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers();
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(12, 32, 1, 76, 34356);


    }

    public static void addNumbers(int... nums){
        int sum =0;
        for(int i : nums){
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
