package ati.website;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class RadioButton extends BaseClass {
	
	@Test
	public void radiobutton() throws InterruptedException {
		WebElement radio = driver.findElement(By.cssSelector("input[name='answer'][value='No']"));
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", radio);
		driver.findElement(By.cssSelector("input[name='answer'][value='No']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@name,'answer')])[3]")).click();
		
	}
	
}
