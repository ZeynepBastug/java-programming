package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        // nums.add(199);   -> ERROR (UnsupportedOperationException) when we assign number by using array, it doesn't allow us to modify it due to Array is immutable rule!
        // Arrays.asList method allow us to create and assign values to ArrayList in 1 statement.
        //     - add, clear, remove cannot be used
        //     - contains, get, isEmpty or any other methods that does not change the size can be used
        // nums.add(100);  ERROR (UnsupportedOperationException)
        // nums.remove(0); ERROR (UnsupportedOperationException)
        // nums.clear();   ERROR (UnsupportedOperationException)
        
        List<Integer> numList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numList.add(33);
        numList.add(56);
        System.out.println("numList = " + numList);

        numList.remove(0);
        numList.remove(new Integer(23));
        System.out.println("numList = " + numList);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke",
                "pepsi", "mdew", "Kambucha", "celsius"));

        for (int i = 0; i < drinksWithCaffeine.size() ; i++) {
            int caffeineAmount = 0;
            if(drinksWithCaffeine.get(i).equals("monster") || drinksWithCaffeine.get(i).equals("red bull") || drinksWithCaffeine.get(i).equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drinksWithCaffeine.get(i) + " has " + caffeineAmount + " of caffeine");
            } else if (drinksWithCaffeine.get(i).equals("coffee") || drinksWithCaffeine.get(i).equals("kambucha")){
                caffeineAmount = 112;
                System.out.println(drinksWithCaffeine.get(i) + " has " + caffeineAmount + " of caffeine");
            } else if (drinksWithCaffeine.get(i).equals("tea") || drinksWithCaffeine.get(i).equals("coke") || drinksWithCaffeine.get(i).equals("pepsi") ||
                    drinksWithCaffeine.get(i).equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drinksWithCaffeine.get(i) + " has " + caffeineAmount + " of caffeine");
            }

        }

        for(String drink : drinksWithCaffeine){
            int caffeineAmount = 0;
            switch(drink){
                case "coffee" : case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " - " + caffeineAmount);
                    break;

                case "tea" : case "coke" : case "pepsi" : case "mdew" :
                    caffeineAmount = 35;
                    System.out.println(drink +  " - " + caffeineAmount);
                    break;

                case "monster" : case "red bull" : case "celsius":
                    caffeineAmount = 115;
                    System.out.println(drink + " - " + caffeineAmount);
                    break;

            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println("* " + drink.toUpperCase()));

        drinksWithCaffeine.forEach(drink -> {
            System.out.println("This is for each block");
            System.out.println("This is to see how it works ");
        });


        



    }
}
