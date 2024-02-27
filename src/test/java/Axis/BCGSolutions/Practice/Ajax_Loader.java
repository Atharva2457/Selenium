package Axis.BCGSolutions.Practice;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajax_Loader {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		Thread.sleep(500);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement clickme=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/p[1]"));
		clickme.click();
		
		Thread.sleep(800);
		
		WebElement close=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
		close.click();
		  driver.navigate().back();
		
}}