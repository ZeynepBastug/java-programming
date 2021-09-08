package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

        //car list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Lada");
        myCars.add("honda");
        myCars.add("mazda");
        myCars.add("tesla");
        myCars.add("Ford");

        // jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString());
        System.out.println(myCars);

        String allCarsIn1St = myCars.toString(); // saves all cars in 1 string variables
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        myCars.set(1, "Lamborghini");
        System.out.println("after set = " + myCars.toString());

        // change 3 to Hundai

        myCars.set(3, "Hundai");
        System.out.println("after set honda = " + myCars.toString());

        /** String str = "java";
         *  str.indexOf("v");
         */

        System.out.println("index of ford " + myCars.indexOf("Ford"));

        int hondaIndex = myCars.indexOf("honda");
        System.out.println("honda index = " + hondaIndex);

        // change honda to subaru
        myCars.set(hondaIndex, "Subaru");
        System.out.println("after set to Subaru = " + myCars);


        // lada -> bugatti
        if(myCars.contains("Toyota")){  // using if condition to avoid error
            myCars.set(myCars.indexOf("Toyota"), "Bugatti");
            System.out.println(myCars);
        } else {
            System.out.println("Toyota is not found");
        }

        for (int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).equals("Lamborghini")){
                myCars.set(myCars.indexOf("Lamborghini"), "Prius");

            } else if(myCars.get(i).equals("Lada")){
                myCars.set(myCars.indexOf("Lada"), "Lexus");

            }else if(myCars.get(i).equals("Subaru")){
                myCars.set(myCars.indexOf("Subaru"), "Audi");
            }

        }
        System.out.println("myCars = " + myCars);







    }
}
