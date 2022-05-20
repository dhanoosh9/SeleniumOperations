package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover1 {
	WebDriver driver;
	@Test
	public void mousehover1() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("img[alt='Electronics']"))).perform();
		driver.findElement(By.xpath("(//a[contains(.,'Gaming')])[2]")).click();
		
		driver.quit();
	}
	
}
