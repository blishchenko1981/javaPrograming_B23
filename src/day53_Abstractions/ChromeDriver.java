package day53_Abstractions;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigate to" + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating the element by :" + locator);

    }

    @Override
    public void gettitle() {
        System.out.println("ChromeDriver getting title of the webPage");

    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver quit");

    }

    @Override
    public void close() {
        System.out.println("ChromeDriver close the tab");
    }
}
