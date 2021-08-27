package day49_Exceptions;

public class Throw_Keyword {
    public static void main(String[] args) {

       // throw new RuntimeException("This is unexpected event");

        //System.out.println("sjfsldkj");

        String browser = "Chroe";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome selected");
        }else if(browser.equalsIgnoreCase("firefox")) {
            System.out.println("firefox");
        }else if(browser.equalsIgnoreCase("opera")) {
        System.out.println("opera"); }else if(browser.equalsIgnoreCase("safari")) {
        System.out.println("safari");}else
        {throw new RuntimeException("Invalid browser name: " + browser);}


    }
}
