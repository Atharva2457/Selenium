package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
		  
		  driver.manage().window().maximize();
	     Thread.sleep(500);
	     
	     WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
	     Select sel = new Select(dropdown);
	     
	     //Select by visible text
	     sel.selectByVisibleText("Option3");
	     Thread.sleep(1000);
	     
	     //Select by value
	     sel.selectByValue("OptionFive");
	     Thread.sleep(1000);
	     //Select by Indexing
	     sel.selectByIndex(1);
	     Thread.sleep(1000);
	     
	     
	     
	}

}
