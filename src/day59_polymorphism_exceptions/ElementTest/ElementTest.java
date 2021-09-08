package day59_polymorphism_exceptions.ElementTest;

public class ElementTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        // loginLink.getLinkHref(); -> ERROR

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtils.clickElement(loginLink);
        WebElementUtils.clickElement(username);
        // WebElementUtils.clickElement(new String("hello")); String is not child of WebElement

        WebElement login = WebElementUtils.getLinkWithText("login");
        login.click();


    }
}
