package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone12 case"};
        //                   0         1        2         3         4          5
        double[] prices = {99.0,     150.0,    9.99,     250.0,   439.50,    39.99};
        int[] itemsIDs = {12345,    123456,   12347,     12348,    12349,    12350};

        System.out.println("--------- FIND THE INDEX OF 'Gloves' IN ITEMS ARRAY ----------");
        // USE FOR LOOP WITH CONDITION
        for(int i = 0; i < items.length ; i++){
            if(items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
            }
        }

        // it's very common code
        System.out.println("\nset  boolean to true if first 'iPad' is found");
        boolean iPadExists = false;

        for (String item : items){
            if(item.equalsIgnoreCase("iPad")){
                iPadExists = true;
                System.out.println("iPadExists = " + iPadExists);
                break;
            }
        }

        if(iPadExists){
            System.out.println("We got the iPad");
        } else {
            System.out.println("we forgot to get iPad :(");
        }

        System.out.println("-----Print a Report of each shopping item-----");
        for (int i = 0; i < items.length; i++){
            System.out.println(i + "- " + items[i] + " - $" + prices[i] + " - #" + itemsIDs[i]);
        }

        System.out.println("------LOOK FOR 'JACKET' IN ITEMS AND PRINT ALL DETAILS------");
        for(int i = 0; i < items.length; i++){
            if(items[i].equals("Jacket")){
                System.out.println("'Jacket' is found in items list");
                System.out.println(items[i] + " - $" + prices[i] + " - " +itemsIDs[i]);

            }
        }

    }
}
