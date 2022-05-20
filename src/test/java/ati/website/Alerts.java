package ati.website;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

public class Alerts extends BaseClass {
	
	@Test
	public void alerts() throws InterruptedException {
		
		driver.findElement(By.id("simpleAlert")).click();
		
		try {
			driver.switchTo().alert().accept();
			driver.findElement(By.id("confirmationAlert")).click();
			driver.switchTo().alert().accept();
			driver.findElement(By.id("promptAlert")).click();
			driver.switchTo().alert().sendKeys("Yes");
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
		
	}
	
}
