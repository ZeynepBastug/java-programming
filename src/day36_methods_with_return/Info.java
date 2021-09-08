package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {
        // procedure -> does not return a value , just executes block of code. in java we call them VOID methods.
        //  function -> returns a value, executes blocks of code and returns a certain value. in java we call them Methods with return or NON-Void methods.


        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(age());

        System.out.println(getRandomYear());
        System.out.println(getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int a = age();
        int year = getRandomYear();

        System.out.println(name);
        System.out.println(married);
        System.out.println(a);
        System.out.println(year);

    }

    public static String fullName(){
        return "Zeynep Bastug";
    }

    public static boolean isMarried(){
        return false;
    }

    public static int age(){
        return 26;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;


    }

}
