package Axis.BCGSolutions.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)", "");
		WebElement login = driver
				.findElement(By.xpath("//h1[contains(text(),'DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)')]"));
		login.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select sel = new Select(dropdown);

		for (int index = 0; index < 4; index++) {
			sel.selectByIndex(index);
			Thread.sleep(1000);
		}

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select sel1 = new Select(dropdown2);

		for (int index = 0; index < 4; index++) {
			sel1.selectByIndex(index);
			Thread.sleep(1000);
		}

		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select sel2 = new Select(dropdown3);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			Thread.sleep(1000);
		}

		String[] checkBoxXPaths = { "//input[@value='option-1']", "//input[@value='option-2']",
				"//input[@value='option-3']", "//input[@value='option-4']" };

		String[] dropDownXPaths = { "//input[@value='green']", "//input[@value='blue']", "//input[@value='yellow']",
				"//input[@value='orange']", "//input[@value='purple']" };

		for (String checks : checkBoxXPaths) {
			WebElement checkBox = driver.findElement(By.xpath(checks));
			if (checkBox.isEnabled()) {
				checkBox.click();
				System.out.println("Checkbox clicked");
				Thread.sleep(1000);
			} else {
				System.out.println("Checkbox not enabled");
			}
		}

		for (String drops : dropDownXPaths) {
			WebElement ddmBox = driver.findElement(By.xpath(drops));
			if (ddmBox.isEnabled()) {
				ddmBox.click();
				System.out.println("ddm clicked");
				Thread.sleep(1000);
			} else {
				System.out.println("ddm not enabled");
			}

		}
		WebElement seldis1 = driver.findElement(By.xpath("//input[@value='lettuce']"));
		seldis1.click();
		Thread.sleep(800);

		WebElement seldis2 = driver.findElement(By.xpath("//input[@value='pumpkin']"));
		seldis2.click();
		Thread.sleep(800);

		WebElement dropdown4 = driver.findElement(By.id("fruit-selects"));
		Select sel4 = new Select(dropdown4);
		sel4.selectByIndex(0);
		Thread.sleep(1000);

		sel4.selectByIndex(2);
		Thread.sleep(1500);

		sel4.selectByIndex(3);
		Thread.sleep(1500);
		driver.close();
	}

}
