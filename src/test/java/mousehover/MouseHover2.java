package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover2 {
	
	WebDriver driver;
	
	@Test
	public void mousedhover2() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Hello, Sign in')]"))).perform();
		driver.findElement(By.xpath("//span[contains(.,'Create a Wish List')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
