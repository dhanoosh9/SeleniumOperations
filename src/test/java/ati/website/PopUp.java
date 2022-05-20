package ati.website;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import easy.website.BaseClass;

public class PopUp extends BaseClass {
	
	@Test
	public void popup() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input[value='Click Me!']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}
	
}
