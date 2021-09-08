package day59_polymorphism_exceptions.ElementTest;

import day59_polymorphism_exceptions.ElementTest.Link;
import day59_polymorphism_exceptions.ElementTest.WebElement;

public class WebElementUtils {

    /**
     * method with polymorphic parameter
     *
     * @param WebElement element and can accept any child class object like Link, InputField etc.
     *                   like Link, InputField etc.
     *                   clickElement(new Link());
     *                   clickElement(new InputField());
     *                   WebElement element = new Link();
     *                   WebElement element = new InputField();
     */
    public static void clickElement(WebElement element){
        System.out.println("Clicking on Element");
        element.click();
    }


    public static WebElement getLinkWithText (String txt) {
    System.out.println("Searching for a link iwth txt = " + txt);

    return new Link();
    }
}
