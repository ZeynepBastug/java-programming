package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";

        try {

            System.out.println("length = " + word.length());
            System.out.println(word.substring(78));
        } catch (NullPointerException e){
            System.out.println("NullPointerException caught and handled, please chech if  String has value");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Index is wrong, please chech if you entered a valid index");
        } catch (Throwable t){ // parent of all exceptions - parent type exception must be
            System.out.println("Exception is caught");
            System.out.println("Reason = " + t.getCause());
        }
    }
}
