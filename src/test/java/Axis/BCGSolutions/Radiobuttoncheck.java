package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttoncheck {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		  driver.manage().window().maximize();
		  WebElement rad1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		  Thread.sleep(500);
		  if(rad1.isDisplayed()) {
			  rad1.click();
		  }
		  
		  
		  WebElement rad2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		  Thread.sleep(500);
		  if(rad2.isDisplayed()) {
			  rad2.click();
		  }

}}
