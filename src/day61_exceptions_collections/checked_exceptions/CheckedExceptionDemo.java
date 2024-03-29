package day61_exceptions_collections.checked_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("About to sleep for 5 seconds");

        /**
         *Thread.sleep(1000); causes/throws an InterruptedException, which is a checked exception
         * 1. HANDLING USING TRY CATCH
         */

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        /**
         * 2. DECLARING USING THROWS KEYWORD
         */

        Thread.sleep(5000);


    }
}
