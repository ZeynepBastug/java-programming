package day14_multi_branch_if_statements;
import java.util.Scanner;
public class CalculatorsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println("enter operator: -, +, *, /");
        char operators = scan.next().charAt(0);

        if(operators == '+'){
            System.out.println(num1 + num2);
        }else if(operators == '-'){
            System.out.println(num1 - num2);
        }else if(operators == '*'){
            System.out.println(num1 * num2);
        }else if(operators == '/'){
            System.out.println(num1 / num2);
        }else {
            System.out.println("invalid operators");
        }
        //  LOGICAL OPERATORS:
        //  &&  ->  AND Operator
        //  ||  ->  OR Operator
        //  !   -> NOT Operator

        //  When you wanna check 2 conditions at once, we can use AND, OR operators to combine conditions in single statement.
        //  && -> AND operator ex:
        //  -> double ampersand. && (AND) operator returns/ produces TRUE when both conditions are true. It checks both
        //  conditions right and left and if both boolean conditions are TRUE, then result will be true
        //  int apples = 3;
        //  int orange = 5;

        //      TRUE         TRUE
        //  apples > 2 && oranges > 4
        //            TRUE

        //      FALSE         TRUE
        //  apples == 1 && oranges < 7
        //            FALSE

        //      TRUE         FALSE
        //  apples < 4 && oranges > 10
        //            FALSE






    }
}
