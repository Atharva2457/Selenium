package Axis.BCGSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Gecko.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		  
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		  WebElement infoalt = driver.findElement(By.xpath("//input[@name='alert']"));
		  infoalt.click();
		  Thread.sleep(1000);
		  Alert alt =driver.switchTo().alert();
		  alt.accept();
		  
		  //confirmational
		  WebElement confalt = driver.findElement(By.xpath("//input[@name='confirmation']"));
		  confalt.click();
		  Thread.sleep(2000);
		  Alert alt1 = driver.switchTo().alert();
		  alt1.dismiss();

		  // PROMPT
		  WebElement promalt = driver.findElement(By.xpath("//input[@name='prompt']"));
		  promalt.click();
		  Thread.sleep(2000);
		  Alert alt2 = driver.switchTo().alert();
		  alt2.sendKeys("HELLO WORLD");
		  Thread.sleep(2000);
		  alt2.accept();
	}
	}

