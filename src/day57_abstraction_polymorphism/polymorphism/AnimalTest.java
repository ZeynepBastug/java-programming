package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a1 = new Animal();  // Not polymorphic, data type and object type are SAME
        a1.makeNoise();
        // Polymorphic way - polymorphism
        Animal a2 = new Dog();
        Animal a3 = new Horse();
        Animal a4 = new Cat();

        a2.makeNoise();
        a3.makeNoise();
        a4.makeNoise();

        // Polymorphic list of objects. List data type is Parent class.
        // objects are any of child classes.
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Dog());
        listOfAnimal.add(new Dog());
        listOfAnimal.add(new Horse());
        listOfAnimal.add(new Cat());

        for(Animal each : listOfAnimal){
            each.makeNoise();
        }

    }
}
