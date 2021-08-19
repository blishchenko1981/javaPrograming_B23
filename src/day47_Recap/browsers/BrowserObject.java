package day47_Recap.browsers;

public class BrowserObject {
    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.open();
        chrome.close();

        Firefox firefox  = new Firefox();
        firefox.open();
        firefox.close();

        Opera opera = new Opera();
        opera.open();
        opera.navigate("www.opera.com");

        Safari safari= new Safari();
        safari.open();
        safari.close();
        safari.backward();

        Edge edge = new Edge();
        edge.open();
        edge.close();
        edge.navigate("www.edge.com");







    }
}
