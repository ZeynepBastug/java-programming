package day54_abstraction;

/**
 * OnlineStudent class will EXTEND Student abstract class
 * This class is considered to be concrete class.
 * It is responsible to implement all abstract method (if any)
 */
public class OnlineStudent extends Student{
    /**
     * attendClass abstract method is implementing by the sub class
     * Sub class is overriding the abstract method of parent class
     */

    @Override
    public void attendClass(){
        System.out.println("Online student is attending the class using Zoom");
    }

    // public abstract coid askQuestion(); ERROR - abstract method cannot be in normal class

}
