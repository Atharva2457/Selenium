package Axis.BCGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  //get URL
		  driver.get("https://automationexercise.com/");
		  Thread.sleep(500);
		  
		  //Navigate Forwards in the browser history
		  driver.navigate().forward();
		  Thread.sleep(500);
		  //Navigate Backwards in browser history
		  driver.navigate().back();
		  Thread.sleep(500);
		  //Refresh page
		  driver.navigate().refresh();
		  
		  driver.close();
	}

}
