package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {

        System.out.println("******* WELCOME TO TD BANK ATM *******");
        int secretPincode = 2233;
        int inputPincode = 2553;

        if(secretPincode == inputPincode){
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");

        }else{
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again!" );
        }
        System.out.println("Thank you for choosing TD Bank");
        //  DEBUGGING USING INTELLIJ
        //  When you have bug in your code, and you want to fin and fix it, you need to do debug run.
        //  Debugging does not show mistake. It helps you find the mistake easier. By slowing down the execution and
        //  letting you see variables and steps

        //  Steps:
        //      1) Put breakpoint by clicking on left side panel where line numbers are. If you do not do this step,
        //      debug will not work
        //      2) Run as DEBUG( BUG ICON)
        //      It will start the program and pause at the breakpoint line.
        //      3) Go to panel below and click on CONSOLE
        //      4) Click on Step Over (broken Arrow) to go step by step

        //  BENEFIT of DEBUGGING:
        //  You can see the flow of execution of your code, and variables values step by step and figure out where is
        //  the issue.




    }

}
