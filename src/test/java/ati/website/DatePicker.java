package ati.website;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DatePicker extends BaseClass {
	
	@Test
	public void datepicker() throws InterruptedException {
		
//		driver.findElement(By.xpath("//*[@id=\"start\"]")).sendKeys("12122019");
//		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"start\"]"));
		String datevalue = "02/02/2019";
		datePcikerByJS(driver, datevalue, element);
		Thread.sleep(3000);
	}
	
	public void datePcikerByJS(WebDriver driver, String date,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"')", element);
	}
	
}
