package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        //  CONDITIONAL STATEMENT:
        //  - if statement
        //  - switch statement
        //  - ternary statement

        //  IF CONDITIONAL STATEMENT IN JAVA:
        //    1) if(condition1) {
        //                code
        //         }else if(condition2) {
        //                code
        //         }else is(condition3) {
        //                code
        //         }else{
        //                code when all above conditions are false


        //  All conditional statements work with boolean (true or false)
        //  In order to produce boolean, there is multiple ways:
        //    -> comparison operators:
        //        >, <, >=, <=, ==, !=
        //    -> String equals() method
        //    -> boolean variables

        //  Assign variable value based on condition:

        System.out.println("Are you sure you want to delete this file?");
         char selection = 'y';
         boolean answer;
         if (selection == 'y') {
             System.out.println("Your file will be deleted.");
             answer = true;
         } else {
             System.out.println("File deletion cancelled");
             answer = false;
         }

             System.out.println("Did file get deleted? - " + answer);


    }
}
