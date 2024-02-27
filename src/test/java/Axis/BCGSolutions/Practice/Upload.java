package Axis.BCGSolutions.Practice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)", "");

		WebElement fn = driver.findElement(By.xpath("//a[@id='file-upload']"));
		fn.click();
		Thread.sleep(1000);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}
		Thread.sleep(1000);
		WebElement fn2 = driver.findElement(By.cssSelector("#myFile"));
		fn2.sendKeys("C:\\Users\\athar\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-23 233504.png");
		Thread.sleep(2000);

		WebElement fn3 = driver.findElement(By.xpath("//input[@id='submit-button']"));
		fn3.click();
		Thread.sleep(3000);

		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		System.out.println("FILE UPLOADED SUCCESSFULLY");
		//driver.close();
		
	}
}
