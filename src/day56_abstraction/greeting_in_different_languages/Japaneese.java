package day56_abstraction.greeting_in_different_languages;

import day56_abstraction.greeting_in_different_languages.Greeting;

public class Japaneese implements Greeting {

    @Override
    public void hi() {
        System.out.println("Konichiva");
    }

    @Override
    public void bye() {
        System.out.println("Sayanora");
    }
}
