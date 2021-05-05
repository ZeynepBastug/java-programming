package day32_arrays_split;

import java.util.*;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone12 case"};
        //                   0         1        2         3         4          5
        double[] prices = {99.0,     150.0,    9.99,     250.0,   439.50,    39.99};
        int[] itemIDs = {12345,    123456,   12347,     12348,    12349,    12350};
        // PSEUDOCODE:
        //      Declare:
        //           double maxPrice = price of first item
        //           int indexOfMaxPrice = index of first item - 0

        // LOOP STARTS FOR prices Array:
        //      read price[i] from array
        //           if price[i] is more than maxPrice
        //                 change maxPrice to price[i]
        //                 set indexOfMaxPrice to i

        System.out.println("-----THE MOST EXPENSIVE ITEM-----");
        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }
        System.out.println("Max price is $" + maxPrice);
        System.out.println(items[indexOfMaxPrice] + " $" + prices[indexOfMaxPrice]+ " " + itemIDs[indexOfMaxPrice]);



    }
}
