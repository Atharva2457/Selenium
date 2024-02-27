package Axis.BCGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandle {
public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  
	  WebElement chkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'][2])"));
	  Thread.sleep(500);
	  if(chkbox2.isSelected()) {
		  chkbox2.click();
	  }
	  WebElement chkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'][1])"));
	  Thread.sleep(500);
	  if(chkbox1.isEnabled()) {
		  chkbox1.click();
	  }
	  
}
}
