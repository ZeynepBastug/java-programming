package day04_variables_intros;

public class VariableNamingRules {
    public static void main (String[] args){
        //int static = 22; -> error, static is reserved by java
        int static2 = 22;
        int _static2 = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
        //int 1stMonthSalary = 3000; --> error, cannot start with number
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine, but not recommended.
        //We should use meaningful variable names
        // int number-of-friends = 400; --> ERROR
        int numberOfFriends = 401;
        int number_of_friends = 401; //not convention

        //int 1stNum = 10; -> CANNOT START with number
        int num1 = 10; // works fine

    }
}
