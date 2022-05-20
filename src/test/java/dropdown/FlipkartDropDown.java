package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartDropDown {
	
	@Test
	public void flipkartdropdown() throws InterruptedException {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'2doB4z')]")).click();
		Actions action = new Actions(driver);
		WebElement login = driver.findElement(By.xpath("//a[contains(.,'Login')]"));
		action.moveToElement(login).perform();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
