package ati.website;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import easy.website.BaseClass;

public class TextArea extends BaseClass {
	
	@Test
	public void textarea() {
		
		driver.findElement(By.name("message")).sendKeys("something is happenning");
		driver.findElement(By.xpath("(//input[contains(@type,'submit')])[1]")).click();
		
	}
	
}
