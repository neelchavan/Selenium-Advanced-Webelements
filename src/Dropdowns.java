import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/neel/SeleniumSetup/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Maximize Window
		driver.manage().window().maximize();

		// Wait after every step
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// ONLY WORKS FOR STATIC DROPDOWNS.

		// Dropdown with select tag
		WebElement staticDropdoen = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdoen);

		// Select options by index
		dropdown.selectByIndex(3);

		// Check which option is selected
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Select options by visible text
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Select options by value text
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Close tab
		driver.close();
	}

}
