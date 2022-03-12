import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/neel/SeleniumSetup/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Maximize Window
		driver.manage().window().maximize();

		// Wait after every step
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Select dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// Select From location
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);

		// Select To loaction ('we are selecting by index method')
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// ('we are selecting by parent to child traverse method') refer section -> 7
		// video no.54.
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
//		.click();

		Thread.sleep(1000);

		// Close tab
		driver.close();
	}

}
