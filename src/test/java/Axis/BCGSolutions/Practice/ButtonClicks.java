package Axis.BCGSolutions.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClicks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		WebElement login = driver.findElement(By.xpath("//h1[contains(text(),'BUTTON CLICKS')]"));
		login.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}
		
		WebElement firstalt = driver.findElement(By.xpath("//span[@id='button1']"));
		  firstalt.click();
		  System.out.println("CLICKED");
		  WebElement click1 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]"));
		  click1.click();  
		  
		  System.out.println("CLICKED");
		  WebElement Secalt = driver.findElement(By.cssSelector("#button2"));
		  Secalt.click();
		  
		  System.out.println("CLICKED");
		  WebElement click2 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[2]"));
		  click2.click();  
		 
		  System.out.println("CLICKED");
		  
		  WebElement Thialt = driver.findElement(By.xpath("//span[@id='button3']"));
		  Thialt.click();
		  
		  System.out.println("CLICKED");
		  WebElement click3 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[1]/div[1]/div[3]/button[1]"));
		  click3.click();  
		  System.out.println("CLICKED");
		  
		  System.out.println("SUCCESSFUL");
		  driver.close();
		  
	}
}