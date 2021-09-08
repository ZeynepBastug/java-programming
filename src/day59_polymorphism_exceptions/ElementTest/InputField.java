package day59_polymorphism_exceptions.ElementTest;

public class InputField implements WebElement {

    public static final String TAG_NAME = "input";

    public String getValue(){
        System.out.println("Getting value in the InputField");
        return "Selenium";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input box " + txt);
    }

    @Override
    public void click() {
        System.out.println("Clicking input box");
    }

    @Override
    public String getText() {
        return null;
    }
}
