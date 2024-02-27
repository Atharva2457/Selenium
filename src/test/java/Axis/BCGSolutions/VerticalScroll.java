package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScroll {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA4NjY5ODM5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	  
	  driver.manage().window().maximize();
     Thread.sleep(500);
//Vertical down scroll (X and Y Coordinates)
     JavascriptExecutor js =(JavascriptExecutor)driver;
//     js.executeScript("window.scrollBy(0,800)","");
//     Thread.sleep(500);
//// Vertical upscroll
//     js.executeScript("window.scrollBy(0,-400)","");
//     Thread.sleep(500);

    WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Meta © 2024')]"));
	js.executeScript("arguments[0].scrollIntoView(true);", ele);

}}
