package ati.website;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import easy.website.BaseClass;

public class IFrame extends BaseClass {
	
	@Test
	public void iframe() {
		
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("iframe_b");
		driver.findElement(By.xpath("//span[contains(.,'Wiktionary')]")).click();
	}
	
}
