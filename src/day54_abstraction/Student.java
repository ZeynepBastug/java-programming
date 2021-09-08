package day54_abstraction;

/*
 * -> We add abstract keyword to a class to make it an abstract class.
 * -> We cannot create object of Student class - meaning:
 *    Student student = new Student(); will show ERROR
 * -> what can we do with this Student class? We can extend this class by sub classes
 * -> Student class will Parent class for all other types of student related classes
 */

public abstract class  Student {

    public void code(String language){
        System.out.println("Student is coding using " + language);

    }

    /*
     * We can add abstract methods into abstract class.
     * abstract method -> is created using abstract keyword
     * and does not have the implementation/method body
     */

    public abstract void attendClass();

}
