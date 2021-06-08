package day44_custon_classes;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal aniObj = new Animal();

        System.out.println(aniObj.type);

        aniObj.eat();
        aniObj.speak();

        aniObj.eat("grass");

        String f = "weed";
        aniObj.eat(f);

        // Create new animal object - cheetahObj
        Animal cheetahObj = new Animal();
    }
}
