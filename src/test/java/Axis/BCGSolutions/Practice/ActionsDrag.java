package Axis.BCGSolutions.Practice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDrag {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		Thread.sleep(500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement web = driver.findElement(By.xpath("//a[@id='actions']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", web);
		Thread.sleep(600);
		web.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles)
		{
			driver.switchTo().window(windowHandle);
		}
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, dest).perform();
		
		System.out.println("Objet is Dragged and Dropped!");
		Thread.sleep(700);
		System.out.println("first box is dragged and dropped in second");
		
		WebElement doubleclick = driver.findElement(By.xpath("//h2[contains(text(),'Double Click Me!')]"));
		builder.doubleClick(doubleclick).perform();
		System.out.println("Double Clicked");
		System.out.println("Double click operation is performed");
		Thread.sleep(700);
		
		WebElement hover = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me First!')]"));
		builder.moveToElement(hover).perform();
		System.out.println("Hovered");
		
		WebElement hoveredlink1 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]"));
		hoveredlink1.click();
		Thread.sleep(1000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		WebElement hover2 = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me Second!')]"));
		builder.moveToElement(hover2).perform();
		System.out.println("Hovered");
		
		WebElement hoveredlink2 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[2]/div[1]/a[1]"));
		hoveredlink2.click();
		System.out.println("Clicked");
		Thread.sleep(1000);
		alt1.accept();
		
		WebElement hover3 = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me Third!')]"));
		builder.moveToElement(hover3).perform();
		System.out.println("Hovered");
		
		WebElement hoveredlink3 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[3]/div[1]/a[1]"));
		hoveredlink3.click();
		System.out.println("Clicked");
		Thread.sleep(1000);
		alt1.accept();
		
		WebElement hoveredlink4 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[3]/div[1]/a[2]"));
		hoveredlink4.click();
		System.out.println("Clicked");
		Thread.sleep(1000);
		alt1.accept();
		System.out.println("Mouse Hovered Successfull");
		
		WebElement clickhold = driver.findElement(By.xpath("//div[@id='click-box']"));
		builder.clickAndHold(clickhold).perform();
		System.out.println("Clicked and Hold is done");
		
		driver.close();
		

	}

}