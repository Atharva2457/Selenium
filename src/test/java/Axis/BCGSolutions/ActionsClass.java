package Axis.BCGSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	  
	  driver.manage().window().maximize();
     Thread.sleep(500);
     
     WebElement doubleclickele = driver.findElement(By.xpath("//input[@id='double-click']"));
     
     Actions builder = new Actions(driver);
     builder.doubleClick(doubleclickele).perform();
    
	  Alert alt =driver.switchTo().alert();
	  alt.accept();
	  
	  builder.contextClick(doubleclickele).perform();
	  
}
}