package practice_09_06_21;

public class BrowserTest {
/*
	=== These browsers can be opened in these operatingSystem ===

				                    chrome   		    --- > mac - windows
				                    chrome-headless 	--- > mac - windows
				                    firefox-headless    --- > mac - windows
				                    firefox             --- > mac - windows
				                    ie 					--- > windows
				                    edge 				--- > windows
				                    safari 			    --- > mac
				                    remote-chrome  		--- > mac - windows

				                    According to related browserName and operatingSystem it should give

				                    	"Browser is opened successfully with $browserName in $operatingSystem"

				                    if operatingSystem does not support $browserName

				                    	"Your $operatingSystem doesn't support ie"

				         If the Browser is already opened it should give an error message

				        	"Browser is already opened with $browserName in $operatingSystem"

				        	bool

 */
public static void main(String[] args) {
    boolean isBrowserOpen = true;
    String browserType = "ie";
    String operatingSistem = "mac";

    if(!isBrowserOpen){
        switch(browserType) {
            case "chrome":
            case "firefox":
            case  "mac":
                System.out.println("you browser is opened successfully with " + browserType+ " in "+ operatingSistem);


            case "ie":
            case "edge":
                if(operatingSistem != "windows"){
                    System.out.println("your " + operatingSistem + "doesnt support " + browserType);
                }






        }

    }else{
        System.err.println("Browser is already opened with " + browserType+ " in " + operatingSistem);
    }



}



}
