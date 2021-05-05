package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        double startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;

            case 2:
                System.out.println("two bedroom apartment selected");
                startingPrice = 2899;
                break;
        }

        System.out.println("Starting price: $" + startingPrice);


        //  switch statement notes:
        //  -> it can only perform == (equals) comparison. Cannot handle any other comparison
        //  -> works only with byte, short, char,int, String, ENUM types.
        //  -> we add cases for each matching. date type of variable and case must be same.
        //  -> we use BREAK; statement at the end of each CASE, to exit the switch block
        //  -> it is easier to read and maintain, if statement can do more.

        //  EXAMPLE:
        //      String result;
        //      int score = 90;




    }
}
