package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {

        printAtoZ();
        printAtoZ();

        for (int i = 0; i < 10; i++) {
            printAtoZ();

        }

        displayUSFlag();
        displayUSFlag();
    }
    public static void printAtoZ(){
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");

        }
        System.out.println();

        // DEBUGGER STEP OPTIONS:
        // - Step over -> runs the line and does not go into method body/details.
        // - Step into -> goes inside the method body to go line by line
        // - Step out -> completes all steps in the method body and goes back to place the method was called from

        // SpringApplication.run();
    }

    public static void displayUSFlag(){
        System.out.println("------------------------ FLAG OF USA ------------------------");
        String p1 = "*  *  *  *  *   =============================================\n  *  *  *  *  *  ============================================";
        String p2 = "=============================================================";

        for(int i = 0; i < 5; i++){
            System.out.println(p1);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(p2);
        }
    }
}
