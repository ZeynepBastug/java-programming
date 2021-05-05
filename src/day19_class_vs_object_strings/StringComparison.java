package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        // CLASS VS OBJECT:
        // Objects are real things around us. Like wooden spoon, cell phone, cheap computers, cheap cars, cheap building etc.
        // They all come from some sort of template or a class
        // Objects have some attributes/data and behaviour.

        // CLASS in Java, is like template or blueprint. it will have 2 MAIN THINGS:
        //   -> DATA/ATTRIBUTES
        //   -> BEHAVIOUR

        // From CLASS Wwe create OBJECTS
        // OBJECT is real things that is created from a certain class. It is concrete.

        // String  -> is a class/template/blueprint that can be used to create objects
        // From String class we create STRING objects.
        // String city = "Baku";

        String city = "Waterloo";
        System.out.println(city.equalsIgnoreCase("waterloo"));


        // equals()  -> compares string with another string and returns true or false. It is case sensitive comparison.
        // EX:
        //    String word = "java";
        //    System.out.println(word.equals("java")); TRUE
        //    System.out.println(word.equals("JAVA")); FALSE
        //    System.out.println(word.equals("Java")); FALSE

        //equalsIgnoreCase()  -> compares string with another string and returns boolean(true or false).
        // It is case INSENSITIVE comparison

        // EX:
        //    String word = "java";
        //    System.out.println(word.equalsIgnoreCase("java")); TRUE
        //    System.out.println(word.equalsIgnoreCase("Java")); TRUE
        //    System.out.println(word.equalsIgnoreCase("JAVA")); TRUE
        //    System.out.println(word.equalsIgnoreCase("ja va")); FALSE

        // We can use equals, and equalsIGnoreCase in if statement, because they return true or false/ boolean.





    }
}
