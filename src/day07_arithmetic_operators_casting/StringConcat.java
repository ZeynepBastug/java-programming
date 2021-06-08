package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main (String[] args){
        // it will go from left to right and will concatenate 5 then 3 to "java".
        // As a result we get java53.
        //If we want to do math calculation first, we need to use ( ) - paranthesis. Value in () will be evaluated/calculated first.


        System.out.println("java" + 5 + 3);
        System.out.println("java" + (5 + 3));
        System.out.println(5 + 3 + "java");

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2);
        //hello friends
        System.out.println(str1 + " " + str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2); //15
        //7 8
        System.out.println(num1 + " " + num2);
        System.out.println("" +num1 + num2);

        // EMPTY STRING:
        // It's a String with no value. It's empty, but it is still String object.
        // How;
        //     String word = ""; word has empty string value now.
        //     " " -> space
        //     "" -> empty




    }

}
