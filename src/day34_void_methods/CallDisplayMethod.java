package day34_void_methods;

public class CallDisplayMethod {
    // Main method is a special method that java looks for when running your code.
    // Main method is not a custom method. It needs to be always typed to be able to run your code.
    // Custom method is YOUR OWN method, that you can name in any way you want.
    // Custom method, cannot run by itself, it needs to be CALLED/USED by name

    // We need to run the code :
    // 1)
    // 2) call out custom method inside the main method
    public static void main(String[] args) {
        //classname.methodName
        FirstMethod.displayMessage();

        // Custom method names need to always make sense to the reader
    }
}
