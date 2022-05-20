package ati.website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Waits extends BaseClass {
	
	@Test
	public void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("testWait123")).click();
		String text = driver.findElement(By.id("timeout_text")).getText();
		System.out.println(text);

		
	}
	
}
