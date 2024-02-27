package Axis.BCGSolutions.Practice;

	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Accordion {
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://webdriveruniversity.com/");

			driver.manage().window().maximize();
			System.out.println("Homepage has opened");
			Thread.sleep(500);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement web = driver.findElement(By.xpath("(//a[@id='page-object-model'])[2]"));
			js.executeScript("arguments[0].scrollIntoView(true);", web);
			Thread.sleep(600);
			web.click();
			System.out.println("Scrolling complete");
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
				driver.switchTo().window(windowHandle);
			}

			WebElement fn1 = driver.findElement(By.xpath("//button[@id='manual-testing-accordion']"));
			fn1.click();
			Thread.sleep(900);
			System.out.println("First accordion");

			WebElement fn2 = driver.findElement(By.xpath("//button[@id='cucumber-accordion']"));
			fn2.click();
			System.out.println("Second accordion");
			Thread.sleep(900);

			WebElement fn3 = driver.findElement(By.xpath("//button[@id='automation-accordion']"));
			fn3.click();
			System.out.println("Third accordion");
			Thread.sleep(900);

			WebElement fn4 = driver.findElement(By.xpath("//button[@id='click-accordion']"));
			fn4.click();
			Thread.sleep(7500);

			WebElement hiddenText = driver.findElement(By.xpath("//p[@id='hidden-text']"));

			if (hiddenText.getText().equals("LOADING COMPLETE.")) {
				WebElement fn5 = driver.findElement(By.xpath("//button[@id='click-accordion']"));
				fn5.click();
				System.out.println("Click1 ");
				System.out.println("Click 1");
				Thread.sleep(500);
				fn5.click();
				System.out.println("Click 2 ");
				System.out.println("Click 2 ");
				Thread.sleep(500);
				fn5.click();
				System.out.println("Click 3");
				
			} else {
				System.out.println("The hidden text is not 'LOADING COMPLETE'. Skipping the subsequent code.");
			}

			driver.close();
		}
	}

