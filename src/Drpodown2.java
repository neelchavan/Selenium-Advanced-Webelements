import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drpodown2 {

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

		// Before selecting the adults
		System.out.println("Before selecting " + driver.findElement(By.id("divpaxinfo")).getText());

		// Select the drowpdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1500);

		// Select 5 adults by clcking the button 4 times using while loop for good
		// practice.
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		// Select 5 adults by clcking the button 4 times using for loop for good
		// practice.
//		for( int j = 1; j < 5; j++ ) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}

		// Click done button to close
		driver.findElement(By.id("btnclosepaxoption")).click();

		// After selecting the adults
		System.out.println("After selecting " + driver.findElement(By.id("divpaxinfo")).getText());
	}

}
