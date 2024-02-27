package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		  
		  WebElement upload = driver.findElement(By.xpath("//input[@name='upload']"));
		  upload.sendKeys("C:\\Users\\athar\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-22 220204.png");

		  WebElement download = driver.findElement(By.xpath("//input[@name='download']"));
		  download.click();
	}

}
