package day14_multi_branch_if_statements;

public class CalculatorsV1 {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = -9;
        char operators = '*';
        if(operators == '+'){
            System.out.println(num1 + num2);
        }else if(operators == '-'){
            System.out.println(num1 - num2);
        }else if(operators == '*'){
            System.out.println(num1 * num2);
        }else if(operators == '/'){
            System.out.println(num1 / num2);
        }else{
            System.out.println("invalid operators");
        }
    }
}
