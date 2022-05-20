package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover3 {
	WebDriver driver;
	
	@Test
	public void mousehover3() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//img[contains(@title,'Printed Dress')])[2]"))).perform();
		driver.findElement(By.xpath("(//span[contains(.,'More')])[4]")).click();
		driver.quit();
	}
	
}
