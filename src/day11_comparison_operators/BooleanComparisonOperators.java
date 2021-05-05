package day11_comparison_operators;
// BOOLEAN|COMPARISON OPERATORS:
// -> Equals (checks if 2 values are equal)
//     A == B
// -> Greater than (checks if first value is greater than second)
//     A > B
// -> Less than (checks if first value is less than second one.)
//     A < B
// -> Greater than or equals to (checks if first value is greater than or equal to second)
//     A >= B
// -> Less  than OR equal ( checks if first value is less than or equal to second one)
//     A <= B
// -> != is not equal (checks if first value is NOT equal to second)

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(12 > 1.9999);
        System.out.println(100 < 10000);
        System.out.println(345 >= 345);
        System.out.println(123 <= 122.999999999);
        System.out.println(-100 != 44);

        boolean result = 5 == 5;
        System.out.println("result = " + result );
        
        result = 33 > 44;
        System.out.println("result = " + result);
        
        result = 88 < 99;
        System.out.println("result = " + result);

        result = 2 != 2;
        System.out.println("result = " + result);
        
        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);


        // So the result of all comparison operators is always boolean.
        // That's why we can also assign value to boolean variables:

        int n1 = 5;
        int n2 = 3;
        System.out.println(n1 == n2);
        boolean check = n1 == n1;


    }
}
