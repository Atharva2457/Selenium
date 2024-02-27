package Axis.BCGSolutions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		  
		  driver.manage().window().maximize();

		  // Implicit waits will wait for all the elements in the script to load before it could throw element not found exception
		  //	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		  Thread.sleep(500);
	     
	     //Find the no. of rows present
	     
	     List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	     int rowcount = rowno.size();
	     System.out.println(rowcount);
	     
	     // Find no. of columns
	     List<WebElement> colno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
	     int colcount = colno.size();
	     System.out.println(colcount);
	     
	     //fetch the cell data from a perticular cell
	     
	     WebElement celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
	     
	     // explicit wait is used to wait for a particular element based on the expected condition
	     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
	     
	     
	     String text = celldata.getText();
	     
	     System.out.println(text);
	     String expectedtext = "tconway@earthlink.net";
	     
	     if (text.equals(expectedtext))
	     {
	    	 System.out.println("The text is correct");
	     }
	     else
	     {
	    	System.out.println("The text is wrong"); 
	     }
	     
	}

}
