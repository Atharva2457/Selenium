package Axis.BCGSolutions.Practice;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");

		WebElement fn = driver.findElement(By.xpath("//a[@id='datepicker']"));
		fn.click();
		Thread.sleep(1000);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement fn2 = driver.findElement(By.xpath("//span[@class='input-group-addon']"));
		fn2.click();
		Thread.sleep(1000);

		WebElement fn3 = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='28']"));
		fn3.click();
		Thread.sleep(1000);

		System.out.println(" Successfull");

		driver.close();
	}
}