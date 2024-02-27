package Axis.BCGSolutions.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingArround {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		Thread.sleep(500);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement web = driver.findElement(By.xpath("//a[@id='scrolling-around']"));
		js.executeScript("arguments[0].scrollIntoView(true);", web);
		web.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}


	}

}
