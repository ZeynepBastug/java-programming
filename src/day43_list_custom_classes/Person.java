package day43_list_custom_classes;

public class Person {
    // Data -> variables
    String firstName;
    int age;
    char gender;
    // behaviour -> method
    public void speak(){
        System.out.println("Person is speaking");
    }
}


class People{
    public static void main(String[] args) {
        // create object of Person class - Instantiation
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 12;

        System.out.println(person2.firstName);
        System.out.println(person2.age);

        System.out.println("Person1 first nama = " + person1.firstName);

        // IN Java class, we can add DATA - variables
        //                           BEHAVIOUR - methods
        // From a class, we can create multiple objects. We use new keyword to create object/ instantiate
        // Person p1 = new Person();
        // Person p2 = new Person();
        // Each object will have the variables and method that are listed in the class.
        // Each object will have their own copy of the variables, if we change value in object variable, it will not
        // affect another one.
        // p1.firstName = "Zeynep";
        // p2.firstName = "Sarah";
        // p1.age = 3;
        // p2.age = 5;
        // p1.gender = 'F';
        //p2.gender = 'F';



    }
}