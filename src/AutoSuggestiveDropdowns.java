import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveDropdowns {

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

		// Select input to type
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);

		// Just replace the findElement () method with findElement**s**(plural)
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		Thread.sleep(1000);

		// Example of Assertions
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());

		// Close Tab
		driver.close();

	}

}
