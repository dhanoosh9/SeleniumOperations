package ati.website;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class DropDown extends BaseClass{
	
	@Test
	public void dropdown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		Select select = new Select(driver.findElement(By.name("cars")));
		select.selectByValue("fiat");
		
	}
	
}
