package Axis.BCGSolutions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleckBoxMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		  driver.manage().window().maximize();
		  List <WebElement> allcheck = driver.findElements(By.xpath("//input[@class='cb1-element']"));
		  Thread.sleep(500);
		  for (WebElement wb :allcheck)
		  {
			  Thread.sleep(500);
			  wb.click();
			  Thread.sleep(500);
			  wb.click();
		  }
	}

}
