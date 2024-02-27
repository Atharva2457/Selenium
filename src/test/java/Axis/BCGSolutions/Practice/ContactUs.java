package Axis.BCGSolutions.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		Thread.sleep(500);
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// vertical down scroll (x and y coordinates)

		js.executeScript("window.scrollBy(0 , 400)", "");
		WebElement tab = driver.findElement(By.xpath("//h1[contains(text(),'CONTACT US')]"));
		tab.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement firstn = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstn.sendKeys("ATHARVA");
		System.out.println("First name is = ATHARVA");
		
		WebElement lastn = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastn.sendKeys("DESHMUKH");
		System.out.println("Last name is = DESHMUKH");
		
		WebElement emailb = driver.findElement(By.xpath("//input[@name='email']"));
		emailb.sendKeys("atharvad34@gmail.com");
		System.out.println("atharvad34@gmail.com");
		
		WebElement commb = driver.findElement(By.xpath("//textarea[@name='message']"));
		commb.sendKeys("Hello Good Morning");
		
		WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
		sub.click();
		System.out.println("Data Submitted");
		driver.navigate().back();
		WebElement res = driver.findElement(By.xpath("//input[@type='reset']"));
		res.click();
		System.out.println("Data reset done");
		
		driver.close();
	}
}
