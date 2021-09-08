package day55_abstraction.interface_demo;

public interface  WebDriver {

    public abstract void get(String url);
    public abstract void findElement(String lcation);
    void quit(); // It is automatically abstract
    String getTitle();


}
