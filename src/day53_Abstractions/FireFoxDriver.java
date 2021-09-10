package day53_Abstractions;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFox - navigate to" + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println(" FireFox- locating the element by :" + locator);
    }

    @Override
    public void gettitle() {
        System.out.println("Firefox getting title of the webPage");

    }

    @Override
    public void quit() {
        System.out.println("Firefox quit");
    }

    @Override
    public void close() {
        System.out.println("Firefox close the tab");
    }
}
