package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.90, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23 };

        String[] countries = {"Brasil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Portugal",
                "Turkey",
                "Russia",
                "India",
                "Canada",
                "Indonesia",
                "Philippines",
                "USA"};

        System.out.println("------------ PRICES MORE THAN 100 -------------");
        for(double eachPrice : prices){
            if (eachPrice > 100.0 ) {
                System.out.print(eachPrice + " ");
            }
        }

        System.out.println("\n------ PRICES BETWEEN 10 AND 70 INCLUSIVE ------ ");
        for(double eachPrice : prices){
            if (eachPrice >= 10 && eachPrice <= 70){
                System.out.print(eachPrice + " ");
            }
        }
        // if you have to write comment to explain what your code is doing, it means your code is not clean code.

        System.out.println("\n-- COUNT OF THE PRICES THAT ARE MORE THAN 50 --");
        int count = 0;
        for(double eachPrice : prices){
            if(eachPrice >= 50.0){
                count++;
            }
        }
        System.out.println("count: " + count);

        System.out.println("\n-- COUNTRIES WITH NAME LENGTH MORE THAN 7 - INCLUSIVE -- ");
        for(String country : countries){
            if(country.length() >= 7 ){
                System.out.print(country + "-" + country.length() + " ");
            }
        }
    }
}
