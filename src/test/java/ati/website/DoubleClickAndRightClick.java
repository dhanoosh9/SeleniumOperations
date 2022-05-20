package ati.website;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickAndRightClick extends BaseClass {
	
	@Test
	public void doubleclickandrightclick() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]"))).perform();
	    try 
	    { 
	        driver.switchTo().alert().dismiss(); 
	        
	    }   
	    catch (NoAlertPresentException Ex) 
	    { 
	        System.out.println("Alert is not present"); 
	    } 
		action.contextClick(driver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]"))).perform();
		Thread.sleep(3000);
	}
	
}
