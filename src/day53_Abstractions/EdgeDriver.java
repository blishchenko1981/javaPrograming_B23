package day53_Abstractions;

public class EdgeDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("EdgeDriver - navigate to" + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println(" EdgeDriver - locating the element by :" + locator);

    }

    @Override
    public void gettitle() {

        System.out.println("EdgeDriver getting title of the webPage");
    }

    @Override
    public void quit() {
        System.out.println("EdgeDriver quit");
    }

    @Override
    public void close() {
        System.out.println("EdgeDriver close");
    }
}
