package day53_Abstractions;

public class AutomationTesting {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.findElement("xpath");
        driver.gettitle();
        driver.close();
        driver.quit();

        System.out.println("-------------------------------------");
        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get("www.google.com");
        driver2.findElement("xpath");
        driver2.gettitle();
        driver2.close();
        driver2.quit();
        System.out.println("-------------------------------------");
        EdgeDriver driver3 = new EdgeDriver();
        driver3.get("www.google.com");
        driver3.findElement("xpath");
        driver3.gettitle();
        driver3.close();
        driver3.quit();


    }


}
