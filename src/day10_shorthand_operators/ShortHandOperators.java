package day10_shorthand_operators;
//           SHORTHAND ASSIGNMENT OPERATORS:
//           in java, or any other programming, we use variables a lot, and we need to update the same variable value often.
//           EX:
//              int num = 10;
//              num = num + 1;
//              num -> 11
//
//              double price = 2.5;
//              price = price * 2;
//              price -> 5.0

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot" + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
        cars -= 6;
        System.out.println("cars = " + cars);
        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("Cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("Normal parking Fee = " + parkingFee);
        // early bird fee is 50% off

        parkingFee /= 2;
        System.out.println("Early bird parking Fee = " + parkingFee);

        //  SHORTHAND/DECREMENT OPERATORS:
        //  ++    --
        //  ++    --  Only increase or decrease value of variable by 1.

        //  int count = 2;
        //  count++;  <- add 1 to the count value
        //  System.out.println(count);

        //  count++; each time adds 1 to the variable value.

        //  -- decrease variable value by 1.
        //  int i = 44;
        //  i--;
        //  System.out.println(i);  -> 43


        //  3 WAYS TO ADD/MINUS 1 FROM VARIABLE:
        //  int num = 10;
        //  num = num + 1;
        //  num += 1;
        //  num++;
        //  ++num;

        // All of those statements above are adding 1 to the value of num.






    }
}
