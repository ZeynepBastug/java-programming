package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        /**
         * public           -> "visible to the world" -> it is accessible by any class in the project.
         * (or other  projects if our project is added to that)
         * static           -> can be called without creating an object (no new keyword needed)
         * void             -> no return value. Method does not return anything/any value. When we call the method, it just
         * executes the code in the method body without returning a value
         * displayMessage() -> method name. Can be anything, need to make the name meaningful. It should sound like an
         * action/behaviour.
         *
         * public static void displayMessage() {
         *     -> CODE HERE is the body of the method, this code will run everytime, method is used/ called. this is
         *     what makes it re-usable
         * }
         */

        displayMessage(); // 1st call the method
        displayMessage(); // 2nd call the method
    }

        // First custom reusable method
        public static void displayMessage() {

            System.out.println("Hello B22 friends!");

        }


}
