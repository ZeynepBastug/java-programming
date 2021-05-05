package day40_arraylist;

import java.util.*;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List isn't empty, first code java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("scooter");
        shoppingList.add("wooden spoon");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, first code java then go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in the list? " + shoppingList.contains("shoes") );
        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        } else {
            System.out.println("Shoes isn't in the list");
        }

        System.out.println("Buying shoes ... $80");

        shoppingList.remove("shoes");
        System.out.println(shoppingList);
        shoppingList.remove(0);
        System.out.println(shoppingList);

        shoppingList.clear();
        System.out.println(shoppingList);



    }
}
