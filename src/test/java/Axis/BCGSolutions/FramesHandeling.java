package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		  
		  driver.manage().window().maximize();
		   
		  WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		  driver.switchTo().frame(frame1);
		  WebElement content = driver.findElement(By.id("tinymce"));
		  content.clear();
		  content.sendKeys("hellow world");
		  
		  
		  
	}

}
