package day44_custon_classes;

public class Animal {

    String type = "donkey";
    public void eat(){
        System.out.println(type + " is eating");
    }

    public void eat(String food){
        System.out.println("Eating " + food);
    }

    public void speak(){
        System.out.println(type + " is speaking");

    }



}
