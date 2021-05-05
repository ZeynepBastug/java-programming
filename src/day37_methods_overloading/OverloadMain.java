package day37_methods_overloading;

import java.util.*;

public class OverloadMain {
    public static void main(String[] args) {
        // we can overload main method by adding a new name main with different parameters
        System.out.println("Hello From Real main method");
        main(10);
        System.out.println(Arrays.toString(args));

    }

    private static void main(int i) {
        System.out.println("hello" + i);
    }


}
