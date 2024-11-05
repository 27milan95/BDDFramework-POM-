package TestUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver browser;
 	
	public void OpenBrowser(String BrowserName) {	 
		 if(BrowserName.equals("Chrome")) {
			browser = new ChromeDriver();			 
		 }else if(BrowserName.equals("FireFox")) {
			browser = new FirefoxDriver();		 
		 }else {
			 System.out.println("Please enter browser name from Chrome or FireFox");
		 }		
		browser.manage().window().maximize();		
	}
	
	public void NavigateToHomePage() {
		String projectpath = System.getProperty("user.dir");
		browser.get(projectpath+Utilities.URl);
	}
	
	public void CloseBrowser() {
		browser.close();
	}

}
