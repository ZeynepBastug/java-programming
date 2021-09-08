package day56_abstraction.greeting_in_different_languages;

import day56_abstraction.greeting_in_different_languages.Greeting;

public class MountainLanguage implements Greeting {

    @Override
    public void hi() {
        System.out.println("Merhaba");
    }

    @Override
    public void bye() {
        System.out.println("Gule gule");
    }
}
