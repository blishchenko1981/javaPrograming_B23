package day53_Abstractions;

public interface WebDriver {
    //  public static void main(String[] args) { // in interface can have only static or default method}
    //     default void method(){}

    // can not have constructor

    public abstract void get(String url);
    void findElement(String locator);
    void gettitle();
    void quit();
    void close();


}
