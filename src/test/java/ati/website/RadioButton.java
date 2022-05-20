package ati.website;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import easy.website.BaseClass;

public class RadioButton extends BaseClass {
	
	@Test
	public void radiobutton() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input[name='answer'][value='No']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@name,'answer')])[3]")).click();
		
	}
	
}
