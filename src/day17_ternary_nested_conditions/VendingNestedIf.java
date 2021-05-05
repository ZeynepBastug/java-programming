package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "tea";
        String snack = "chips";
        if (selection.equals("drink")){
            System.out.println("Drink option is selected");
            if(drink.equals("tea")){
                System.out.println("tea item is selected");
            }else {
                System.out.println("coke item is selected");
            }
        }else {
            System.out.println("Snack option is selected");
            if(snack.equals("chips")){
                System.out.println("Chips item is selected");
            }else {
                System.out.println("candy item is selected");
            }
        }



    }
}
