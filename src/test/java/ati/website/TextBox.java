package ati.website;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TextBox extends BaseClass {
	
	@Test
	public void textbox() {
		driver.findElement(By.name("firstname")).sendKeys("fake");
		driver.findElement(By.name("lastname")).sendKeys("news");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
}
